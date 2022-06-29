package org.example.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.util.ArrayList;

@Data
public class MovieSessionDto {
    private String filmName;
    private Timestamp time;
    private CinemaHallDto hall;
    private ArrayList<TicketDto> tickets;
}
