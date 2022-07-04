package org.example.mapper;

import org.example.dto.MovieSessionDto;
import org.example.dto.TicketDto;
import org.example.dto.UserDto;
import org.example.model.MovieSession;
import org.example.model.Ticket;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class MovieSessionMapper implements BaseMapper<MovieSession, MovieSessionDto>{
    private TicketMapper ticketMapper;
    @Override
    public MovieSessionDto mapToDto(MovieSession movieSession){
        MovieSessionDto movieSessionDto = new MovieSessionDto();
        movieSessionDto.setFilmName(movieSession.getFilmName());
        movieSessionDto.setTime(movieSession.getTime());

        List<TicketDto> ticketsDto = new ArrayList<>();
        for (Ticket i: movieSession.getTickets()) {
            ticketsDto.add(ticketMapper.mapToDto(i));
        }
        movieSessionDto.setTickets(ticketsDto);

        return movieSessionDto;
    }

    @Override
    public MovieSession mapToModel(MovieSessionDto movieSessionDto) {
        return null;
    }
}

