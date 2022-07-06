package org.example.dto;

import lombok.Data;
import java.util.List;

@Data
public class CinemaHallDto {
    private String name;
    private int seatsCount;
    private List<MovieSessionDto> movieSessions;
}
