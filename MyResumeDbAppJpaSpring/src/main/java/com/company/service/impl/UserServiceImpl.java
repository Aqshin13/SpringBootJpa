package com.company.service.impl;

import com.company.dao.impl.UserRepositoryCustom;
import com.company.entity.User;
import com.company.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserServiceInter {

    @Autowired
    @Qualifier(value = "userDaoImpl")
    UserRepositoryCustom userDaoInter;


    @Override
    public List<User> getAllUser(String name, String surname, String nationality) {
        return userDaoInter.getAllUser(name, surname, nationality);
    }

    @Override
    public User getUserById(int id) {
        return userDaoInter.getUserById(id);
    }

    @Override
    public boolean removeUser(int id) {
        return userDaoInter.removeUser(id);
    }

    @Override
    public boolean addUser(User u) {
        return userDaoInter.addUser(u);
    }

    @Override
    public boolean updateUser(User u) {
        return userDaoInter.updateUser(u);
    }

    @Override
    public User getEmail(String email) {
        return userDaoInter.getEmail(email);
    }
}
