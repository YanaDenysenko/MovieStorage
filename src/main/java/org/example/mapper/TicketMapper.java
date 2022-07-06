package org.example.mapper;

import org.example.dto.TicketDto;
import org.example.model.Ticket;

public class TicketMapper implements BaseMapper<Ticket, TicketDto>{
    @Override
    public TicketDto mapToDto (Ticket ticket){
        TicketDto ticketDto = new TicketDto();
        ticketDto.setPrice(ticket.getPrice());
        ticketDto.setTicketStatus(ticket.getTicketStatus());

        return ticketDto;
    }

    @Override
    public Ticket mapToModel(TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setPrice(ticketDto.getPrice());
        ticket.setTicketStatus(ticketDto.getTicketStatus());

        return ticket;
    }
}
