package org.example.service;

import org.example.dto.CinemaHallDto;

public interface CinemaHallService {
    CinemaHallDto getCinemaHallDtoById(long cinemaHallId);

    void saveCinemaHallDto(CinemaHallDto cinemaHalDto);

    void updateCinemaHallDto(CinemaHallDto cinemaHalDto);

    void deleteCinemaHallDto(CinemaHallDto cinemaHallDto);
}
