package org.example.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "movie_session")
public class MovieSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "film_name", nullable = false)
    private String filmName;

    @Column(name = "time", nullable = false)
    private Timestamp time;

    @Column(name = "hall_id", nullable = false)
    private CinemaHall hall; //TODO

    @Column(name = "ticket_id")
    private List<Ticket> tickets; //TODO
}
