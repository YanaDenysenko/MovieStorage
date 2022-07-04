package org.example.repository;

import org.example.model.CinemaHall;

public interface CinemaHallRepository {
    CinemaHall getCinemaHallById(long cinemaHallId);

    void saveCinemaHall(CinemaHall cinemaHal);

    void updateCinemaHall(CinemaHall cinemaHal);

    void deleteCinemaHall(CinemaHall cinemaHal);
}
