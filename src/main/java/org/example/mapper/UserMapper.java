package org.example.mapper;

import org.example.dto.TicketDto;
import org.example.dto.UserDto;
import org.example.model.Ticket;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserMapper implements BaseMapper<User, UserDto>{
    private TicketMapper ticketMapper;
    @Override
    public UserDto mapToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setLogin(user.getLogin());
        userDto.setPassword(user.getPassword());
        userDto.setName(user.getName());
        userDto.setDateOfBirth(user.getDateOfBirth());

        List<TicketDto> ticketsDto = new ArrayList<>();
        for (Ticket i: user.getTickets()) {
            ticketsDto.add(ticketMapper.mapToDto(i));
        }
        userDto.setTickets(ticketsDto);

        return userDto;
    }

    @Override
    public User mapToModel(UserDto userDto) {
        User user = new User();
        user.setLogin(userDto.getLogin());
        user.setPassword(userDto.getPassword());
        user.setName(userDto.getName());
        user.setDateOfBirth(userDto.getDateOfBirth());

        List<Ticket> tickets = new ArrayList<>();
        for (TicketDto i: userDto.getTickets()) {
            tickets.add(ticketMapper.mapToModel(i));
        }
        user.setTickets(tickets);

        return user;
    }
}
