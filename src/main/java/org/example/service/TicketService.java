package org.example.service;

import org.example.dto.TicketDto;

public interface TicketService {
    TicketDto getTicketDtoById(long ticketId);

    void saveTicketDto(TicketDto ticketDto);

    void updateTicketDto(TicketDto ticketDto);

    void deleteTicketDto(TicketDto ticketDto);
}
