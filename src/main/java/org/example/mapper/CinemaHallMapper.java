package org.example.mapper;

import org.example.dto.CinemaHallDto;
import org.example.dto.MovieSessionDto;
import org.example.model.CinemaHall;
import org.example.model.MovieSession;

import java.util.ArrayList;
import java.util.List;

public class CinemaHallMapper implements BaseMapper<CinemaHall, CinemaHallDto>{
    private MovieSessionMapper movieSessionMapper;
    @Override
    public CinemaHallDto mapToDto (CinemaHall cinemaHall){
        CinemaHallDto cinemaHallDto = new CinemaHallDto();
        cinemaHallDto.setName(cinemaHall.getName());
        cinemaHallDto.setSeatsCount(cinemaHall.getSeatsCount());

        List<MovieSessionDto> movieSessionsDto = new ArrayList<>();
        for (MovieSession i: cinemaHall.getMovieSessions()) {
            movieSessionsDto.add(movieSessionMapper.mapToDto(i));
        }
        cinemaHallDto.setMovieSessions(movieSessionsDto);

        return cinemaHallDto;
    }

    @Override
    public CinemaHall mapToModel(CinemaHallDto cinemaHallDto) {
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.setName(cinemaHallDto.getName());
        cinemaHall.setSeatsCount(cinemaHallDto.getSeatsCount());

        List<MovieSession> movieSessions = new ArrayList<>();
        for (MovieSessionDto i: cinemaHallDto.getMovieSessions()) {
            movieSessions.add(movieSessionMapper.mapToModel(i));
        }
        cinemaHall.setMovieSessions(movieSessions);

        return cinemaHall;
    }
}
