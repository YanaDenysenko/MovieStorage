package org.example.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private long id;

    @ManyToOne
    @JoinColumn(name="movie_session_id", nullable = false)
    private MovieSession movieSession;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "ticket_status", nullable = false)
    private TicketStatus ticketStatus;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
