package org.example.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "movie_session", nullable = false)
    private MovieSession session; //TODO

    @Column(name = "price", nullable = false)
    private int price; //TODO refactor price type

    @Column(name = "ticket_status", nullable = false)
    private TicketStatus status;
}
