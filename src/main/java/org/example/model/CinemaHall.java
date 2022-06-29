package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cinema_hall")
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "seats_count", nullable = false)
    private int seatsCount;

    @OneToMany(mappedBy="cinemaHall")
    private List<MovieSession> movieSessions;
}
