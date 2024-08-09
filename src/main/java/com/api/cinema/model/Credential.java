package com.api.cinema.model;

import com.api.cinema.dto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.UUID;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter @Setter
@Entity
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;

    public Credential(UUID id, String email, String password, User userId) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userId = userId;
    }

    public Credential(UserDto dto) {
        this.email = dto.getEmail();
        this.password = encryptPassword(dto.getPassword());
    }

    public Credential() {

    }

    public String encryptPassword(String password){
        return new BCryptPasswordEncoder().encode(password);
    }
}
