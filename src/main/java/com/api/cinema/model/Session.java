package com.api.cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String language;
    @Column(nullable = false)
    private String sessionDate;
    @Column(nullable = false)
    private Date time;
    @Column(nullable = false)
    private String room;
    private Boolean sessionIsExpire;
    @OneToMany(mappedBy = "sessionId", cascade = CascadeType.ALL)
    private List<Seat> seatId;
}
