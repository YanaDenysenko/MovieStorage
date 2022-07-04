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
    public TicketDto getTicketDtoById(long ticketId) {
        return ticketMapper.mapToDto(ticketRepository.getTicketById(ticketId));
    }

    @Override
    public void saveTicketDto(TicketDto ticketDto) {

    }

    @Override
    public void updateTicketDto(TicketDto ticketDto) {

    }

    @Override
    public void deleteTicketDto(TicketDto ticketDto) {

    }
}
