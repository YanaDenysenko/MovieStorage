package org.example.repository.impl;

import org.example.model.CinemaHall;
import org.example.repository.CinemaHallRepository;
import org.example.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CinemaHallRepositoryImpl implements CinemaHallRepository {
    private final SessionFactory sessionFactory;

    public CinemaHallRepositoryImpl() {
        this.sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();
    }

    @Override
    public CinemaHall getCinemaHallById(long cinemaHallId) {
        Session session = sessionFactory.openSession();
        CinemaHall cinemaHall = session.get(CinemaHall.class, cinemaHallId);
        session.close();
        return cinemaHall;
    }

    @Override
    public void saveCinemaHall(CinemaHall cinemaHall){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(cinemaHall);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateCinemaHall(CinemaHall cinemaHall){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(cinemaHall);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteCinemaHall(CinemaHall cinemaHall){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(cinemaHall);
        transaction.commit();
        session.close();
    }
}
