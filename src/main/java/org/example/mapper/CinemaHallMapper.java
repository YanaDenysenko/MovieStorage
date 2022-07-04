package org.example.mapper;

import org.example.dto.CinemaHallDto;
import org.example.dto.MovieSessionDto;
import org.example.dto.UserDto;
import org.example.model.CinemaHall;
import org.example.model.MovieSession;
import org.example.model.User;

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
        return null;
    }
}
