package org.example.repository.impl;

import org.example.model.MovieSession;
import org.example.repository.MovieSessionRepository;
import org.example.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MovieSessionRepositoryImpl implements MovieSessionRepository {
    private final SessionFactory sessionFactory;

    public MovieSessionRepositoryImpl() {
        this.sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();
    }

    @Override
    public MovieSession getMovieSessionById(long movieSessionId) {
        Session session = sessionFactory.openSession();
        MovieSession movieSession = session.get(MovieSession.class, movieSessionId);
        session.close();
        return movieSession;
    }

    @Override
    public void saveMovieSession(MovieSession movieSession){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(movieSession);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateMovieSession(MovieSession movieSession){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(movieSession);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteMovieSession(MovieSession movieSession){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(movieSession);
        transaction.commit();
        session.close();
    }
}
