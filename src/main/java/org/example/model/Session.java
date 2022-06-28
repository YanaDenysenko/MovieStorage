package org.example.model;

import lombok.Data;
import java.sql.Timestamp;
import java.util.ArrayList;

@Data
public class Session {
    private long id;
    private String filmName;
    private Timestamp time;
    private CinemaHall hall;
    private ArrayList<Ticket> tickets;
}
