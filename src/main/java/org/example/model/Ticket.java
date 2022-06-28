package org.example.model;
import lombok.Data;

@Data
public class Ticket {
    private long id;
    private Session session;
    private short price;
    private TicketStatus status;
}
