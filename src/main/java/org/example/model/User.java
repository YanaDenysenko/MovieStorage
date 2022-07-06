package org.example.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;
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

    @Column(name = "date_of_birth")
    private Timestamp dateOfBirth;

    @OneToMany(mappedBy="user")
    private List<Ticket> tickets;
}
