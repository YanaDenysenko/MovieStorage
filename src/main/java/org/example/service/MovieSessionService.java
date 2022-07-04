package org.example.service;

import org.example.dto.MovieSessionDto;

public interface MovieSessionService {
    MovieSessionDto getMovieSessionDtoById(long movieSessionId);

    void saveMovieSessionDto(MovieSessionDto movieSessionDto);

    void updateMovieSessionDto(MovieSessionDto movieSessionDto);

    void deleteMovieSessionDto(MovieSessionDto movieSessionDto);
}
