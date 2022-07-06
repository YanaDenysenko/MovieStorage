package org.example.service.impl;

import lombok.AllArgsConstructor;
import org.example.dto.CinemaHallDto;
import org.example.mapper.CinemaHallMapper;
import org.example.repository.impl.CinemaHallRepositoryImpl;
import org.example.service.CinemaHallService;

@AllArgsConstructor
public class CinemaHallImpl implements CinemaHallService {
    private CinemaHallRepositoryImpl cinemaHallRepository;
    private CinemaHallMapper cinemaHallMapper;

    @Override
    public CinemaHallDto getCinemaHallById(long cinemaHallId) {
        return cinemaHallMapper.mapToDto(cinemaHallRepository.getCinemaHallById(cinemaHallId));
    }

    @Override
    public void saveCinemaHall(CinemaHallDto cinemaHallDto) {
        cinemaHallRepository.saveCinemaHall(cinemaHallMapper.mapToModel(cinemaHallDto));
    }

    @Override
    public void updateCinemaHall(CinemaHallDto cinemaHallDto) {
        cinemaHallRepository.updateCinemaHall(cinemaHallMapper.mapToModel(cinemaHallDto));
    }

    @Override
    public void deleteCinemaHall(CinemaHallDto cinemaHallDto) {
        cinemaHallRepository.deleteCinemaHall(cinemaHallMapper.mapToModel(cinemaHallDto));
    }
}
