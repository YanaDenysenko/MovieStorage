package org.example.dto;

import lombok.Data;

@Data
public class TicketDto {
    private MovieSessionDto session;
    private short price;
    private TicketStatusDto status;
}
