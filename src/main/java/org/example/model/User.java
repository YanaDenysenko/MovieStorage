package org.example.model;

import lombok.Data;
import java.util.ArrayList;
import java.sql.Timestamp;

@Data
public class User {
    private long id;
    private String login;
    private String password;
    private String name;
    private Timestamp birthday;
    private ArrayList<Ticket> tickets;
}
