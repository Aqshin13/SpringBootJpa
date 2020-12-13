package com.company.service.inter;

import com.company.entity.User;

import java.util.List;

public interface UserServiceInter {

    List<User> getAllUser(String name, String surname, String nationality);

    User getUserById(int id);

    boolean removeUser(int id);

    boolean addUser(User u);

    boolean updateUser(User u);
    User getEmail(String email);
}
