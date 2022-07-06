package org.example.service.impl;

import lombok.AllArgsConstructor;
import org.example.dto.TicketDto;
import org.example.mapper.TicketMapper;
import org.example.repository.impl.TicketRepositoryImpl;
import org.example.service.TicketService;

@AllArgsConstructor
public class TicketServiceImpl implements TicketService {
    private TicketRepositoryImpl ticketRepository;
    private TicketMapper ticketMapper;
    @Override
    public TicketDto getTicketById(long ticketId) {
        return ticketMapper.mapToDto(ticketRepository.getTicketById(ticketId));
    }

    @Override
    public void saveTicket(TicketDto ticketDto) {
        ticketRepository.saveTicket(ticketMapper.mapToModel(ticketDto));
    }

    @Override
    public void updateTicket(TicketDto ticketDto) {
        ticketRepository.updateTicket(ticketMapper.mapToModel(ticketDto));
    }

    @Override
    public void deleteTicket(TicketDto ticketDto) {
        ticketRepository.deleteTicket(ticketMapper.mapToModel(ticketDto));
    }
}
