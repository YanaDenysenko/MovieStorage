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
    public MovieSessionDto getMovieSessionById(long movieSessionId) {
        return movieSessionMapper.mapToDto(movieSessionRepository.getMovieSessionById(movieSessionId));
    }

    @Override
    public void saveMovieSession(MovieSessionDto movieSessionDto) {
        movieSessionRepository.saveMovieSession(movieSessionMapper.mapToModel(movieSessionDto));
    }

    @Override
    public void updateMovieSession(MovieSessionDto movieSessionDto) {
        movieSessionRepository.updateMovieSession(movieSessionMapper.mapToModel(movieSessionDto));
    }

    @Override
    public void deleteMovieSession(MovieSessionDto movieSessionDto) {
        movieSessionRepository.deleteMovieSession(movieSessionMapper.mapToModel(movieSessionDto));
    }
}
