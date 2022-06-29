package org.example.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "birthday")
    private Timestamp birthday; // TODO change field name

    @Column(name = "ticket_id")
    private ArrayList<Ticket> tickets; //TODO
}
