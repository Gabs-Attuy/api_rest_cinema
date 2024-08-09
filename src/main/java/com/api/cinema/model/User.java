package com.api.cinema.model;

import com.api.cinema.dto.UserDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private LocalDateTime bornDate;
    @Column(nullable = false, unique = true)
    private String CPF;
    private String phone;
    @OneToMany(mappedBy = "userId")
    private List<Order> orders;

    public User(UserDto dto) {
        this.name = dto.getName();
        this.CPF = dto.getCPF();
        this.bornDate = LocalDateTime.now();
        this.phone = dto.getPhone();
    }
}
