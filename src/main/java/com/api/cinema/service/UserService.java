package com.api.cinema.service;

import com.api.cinema.dto.UserDto;
import com.api.cinema.model.Credential;
import com.api.cinema.model.User;
import com.api.cinema.repository.CredentialRepository;
import com.api.cinema.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import static com.api.cinema.model.Credential.encryptPassword;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CredentialRepository credentialRepository;

    @Autowired
    private EmailService emailService;

    @Autowired
    private OTPService otpService;

    public ResponseEntity<UserDto> createUser(UserDto dto) throws Exception {
        User user = new User(dto);
        userRepository.save(user);
        User id = userRepository.findById(user.getId()).orElseThrow(() -> new Exception("User not found!"));
        Credential credential = new Credential();
        credential.setUserId(id);
        credential.setEmail(dto.getEmail());
        credential.setPassword(encryptPassword(dto.getPassword()));
        credentialRepository.save(credential);

        emailService.sendActivityMail(dto.getEmail(), "Account Validation", "Validate your account with this OTP: " +
                otpService.generateOTP() + ".\nThanks for your presence and preference!");
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
