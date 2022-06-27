package org.example.dto;

import lombok.Data;
import java.util.List;

@Data
public class UserDto {
    private String name;
    private int age;
    private List<TicketDto> tickets;
}
