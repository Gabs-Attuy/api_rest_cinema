package com.api.cinema.dto;

import jakarta.persistence.Column;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

public class UserDTO {

    private String name;
    private Date bornDate;
    @CPF
    private String CPF;
    private String phone;
}
