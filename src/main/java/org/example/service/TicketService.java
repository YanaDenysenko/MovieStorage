package org.example.service;

import org.example.dto.TicketDto;

public interface TicketService {
    TicketDto getTicketById(long ticketId);

    void saveTicket(TicketDto ticketDto);

    void updateTicket(TicketDto ticketDto);

    void deleteTicket(TicketDto ticketDto);
}
