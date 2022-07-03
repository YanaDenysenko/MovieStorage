package org.example.repository.impl;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public User getById(long userId) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, userId);
    }

    public void saveUser(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }
}
