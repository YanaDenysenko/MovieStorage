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
    public CinemaHallDto getCinemaHallDtoById(long cinemaHallId) {
        return cinemaHallMapper.mapToDto(cinemaHallRepository.getCinemaHallById(cinemaHallId));
    }

    @Override
    public void saveCinemaHallDto(CinemaHallDto cinemaHalDto) {

    }

    @Override
    public void updateCinemaHallDto(CinemaHallDto cinemaHalDto) {

    }

    @Override
    public void deleteCinemaHallDto(CinemaHallDto cinemaHallDto) {

    }
}
