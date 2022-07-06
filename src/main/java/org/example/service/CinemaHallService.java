package org.example.service;

import org.example.dto.CinemaHallDto;

public interface CinemaHallService {
    CinemaHallDto getCinemaHallById(long cinemaHallId);

    void saveCinemaHall(CinemaHallDto cinemaHalDto);

    void updateCinemaHall(CinemaHallDto cinemaHalDto);

    void deleteCinemaHall(CinemaHallDto cinemaHallDto);
}
