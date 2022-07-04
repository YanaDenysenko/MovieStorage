package org.example.model;

import lombok.Data;
import javax.persistence.*;
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

    @ManyToOne
    @JoinColumn(name="movie_session_id", nullable = false)
    private CinemaHall cinemaHall;

    @OneToMany(mappedBy="movieSession")
    private List<Ticket> tickets;
}
