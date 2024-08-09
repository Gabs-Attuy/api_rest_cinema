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

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CredentialRepository credentialRepository;

    public ResponseEntity<User> createUser(UserDto dto) {
        User user = new User(dto);
        userRepository.save(user);

        Credential credential = new Credential();
        credential.setEmail(dto.getEmail());
        credential.setPassword(dto.getPassword());
        credentialRepository.save(credential);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
