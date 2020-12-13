package com.company.dao.impl;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer>,UserRepositoryCustom {

    @Query("select u from User u where u.name=?1")
    User findByName(String name);
}
