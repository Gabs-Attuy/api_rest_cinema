package com.api.cinema.dto;

import com.api.cinema.enums.UserStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class UserDto {

    @NotBlank
    private String name;
    private LocalDateTime bornDate = LocalDateTime.now();
    @CPF
    private String CPF;
    private String phone;
    @NotBlank
    private String email;
    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private UserStatus userStatus = UserStatus.PENDING;
}
