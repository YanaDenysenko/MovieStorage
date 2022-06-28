package org.example.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.util.ArrayList;

@Data
public class UserDto {
    private String login;
    private String password;
    private String name;
    private Timestamp birthday;
    private ArrayList<TicketDto> tickets;
}
