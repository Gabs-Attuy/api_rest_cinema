package com.api.cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;

    public static String encryptPassword(String password){
        return new BCryptPasswordEncoder().encode(password);
    }
}
