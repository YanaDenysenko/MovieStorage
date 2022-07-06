package org.example.repository;

import org.example.model.Ticket;

public interface TicketRepository {
    Ticket getTicketById(long ticketId);

    void saveTicket(Ticket ticket);

    void updateTicket(Ticket ticket);

    void deleteTicket(Ticket ticket);
}
