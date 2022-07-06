package org.example.repository;

import org.example.model.MovieSession;

public interface MovieSessionRepository {
    MovieSession getMovieSessionById(long movieSessionId);

    void saveMovieSession(MovieSession movieSession);

    void updateMovieSession(MovieSession movieSession);

    void deleteMovieSession(MovieSession movieSession);
}
