package org.example.dto;

import lombok.Data;

@Data
public class TicketDto {
    private MovieSessionDto session;
    private double price;
    private TicketStatusDto status;
}
