package org.example.repository.impl;

import org.example.model.Ticket;
import org.example.repository.TicketRepository;
import org.example.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TicketRepositoryImpl implements TicketRepository {
    private final SessionFactory sessionFactory;

    public TicketRepositoryImpl() {
        this.sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();
    }

    @Override
    public Ticket getTicketById(long ticketId) {
        Session session = sessionFactory.openSession();
        Ticket ticket = session.get(Ticket.class, ticketId);
        session.close();
        return ticket;
    }

    @Override
    public void saveTicket(Ticket ticket){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(ticket);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateTicket(Ticket ticket){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(ticket);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteTicket(Ticket ticket){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(ticket);
        transaction.commit();
        session.close();
    }
}
