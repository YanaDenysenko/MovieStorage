package org.example.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

@Data
public class MovieSessionDto {
    private String filmName;
    private Timestamp time;
    private List<TicketDto> tickets;
}
