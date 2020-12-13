package com.company.dao.impl;

import com.company.entity.User;

import java.util.List;

public interface UserRepositoryCustom {

    List<User> getAllUser(String name, String surname, String nationality);

    User getUserById(int id);

    boolean removeUser(int id);

    boolean addUser(User u);

    boolean updateUser(User u);

    User getEmail(String email);
}
