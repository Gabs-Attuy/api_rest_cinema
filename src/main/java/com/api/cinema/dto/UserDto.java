package com.api.cinema.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class UserDto {

    @NotBlank
    private String name;
    private Date bornDate;
    @CPF
    private String CPF;
    private String phone;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
