package org.example.repository;

import org.example.model.User;

public interface UserRepository {
    User getById(long userId);
}
