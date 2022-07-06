package org.example.service;

import org.example.dto.MovieSessionDto;

public interface MovieSessionService {
    MovieSessionDto getMovieSessionById(long movieSessionId);

    void saveMovieSession(MovieSessionDto movieSessionDto);

    void updateMovieSession(MovieSessionDto movieSessionDto);

    void deleteMovieSession(MovieSessionDto movieSessionDto);
}
