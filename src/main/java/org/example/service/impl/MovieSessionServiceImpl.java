package org.example.service.impl;

import lombok.AllArgsConstructor;
import org.example.dto.MovieSessionDto;
import org.example.mapper.MovieSessionMapper;
import org.example.repository.impl.MovieSessionRepositoryImpl;
import org.example.service.MovieSessionService;

@AllArgsConstructor
public class MovieSessionServiceImpl implements MovieSessionService {
    private MovieSessionRepositoryImpl movieSessionRepository;
    private MovieSessionMapper movieSessionMapper;

    @Override
    public MovieSessionDto getMovieSessionDtoById(long movieSessionId) {
        return movieSessionMapper.mapToDto(movieSessionRepository.getMovieSessionById(movieSessionId));
    }

    @Override
    public void saveMovieSessionDto(MovieSessionDto movieSessionDto) {

    }

    @Override
    public void updateMovieSessionDto(MovieSessionDto movieSessionDto) {

    }

    @Override
    public void deleteMovieSessionDto(MovieSessionDto movieSessionDto) {

    }
}
