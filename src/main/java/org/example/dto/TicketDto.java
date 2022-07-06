package org.example.dto;

import lombok.Data;
import org.example.model.TicketStatus;

@Data
public class TicketDto {
    private double price;
    private TicketStatus ticketStatus;
}
