package org.example.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

@Data
public class UserDto {
    private String login;
    private String password;
    private String name;
    private Timestamp dateOfBirth;
    private List<TicketDto> tickets;
}
