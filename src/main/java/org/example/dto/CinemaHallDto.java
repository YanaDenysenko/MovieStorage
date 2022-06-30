package org.example.dto;

import lombok.Data;
import org.example.model.MovieSession;

import java.util.List;

@Data
public class CinemaHallDto {
    private String name;
    private int seatsCount;
    private List<MovieSessionDto> movieSessions;
}
