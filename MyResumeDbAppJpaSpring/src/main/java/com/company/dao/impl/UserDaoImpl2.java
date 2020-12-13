package com.company.dao.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository(value = "userDaoImp2")
@Transactional
public class UserDaoImpl2 extends AbstractDAO implements UserRepositoryCustom {


    @PersistenceContext
    EntityManager em;

    @Override
    public List<User> getAllUser(String name, String surname, String nationalityId) {
        String jpql = "select u from User u where 1=1 ";
        if (name != null && !name.trim().isEmpty()) {
            jpql += " and u.name=:name ";
        }
        if (surname != null && !surname.trim().isEmpty()) {
            jpql += " and u.surname=:surname";
        }
        if (nationalityId != null) {
            jpql += " and u.nationality.name=:natName";
        }
        Query query = em.createQuery(jpql);
        if (name != null && !name.trim().isEmpty()) {
            query.setParameter("name", name);
        }
        if (surname != null && !surname.trim().isEmpty()) {
            query.setParameter("surname", surname);

        }
        if (nationalityId != null && !nationalityId.trim().isEmpty()) {
            query.setParameter("natName", nationalityId);

        }

        List<User> list = query.getResultList();
        return list;
    }

    @Override
    public User getUserById(int id) {
        User u = em.find(User.class, id);
        return u;
    }

    @Override
    public boolean removeUser(int id) {
        User u = em.find(User.class, id);
        em.remove(u);
        return true;
    }

    @Override
    public boolean addUser(User u) {
        em.persist(u);
        return true;

    }

    public User getEmail(String email) {
        Query query = em.createQuery("select u from User u where u.email=:email");
        query.setParameter("email", email);
        List<User> list = query.getResultList();
        return list.get(0);
    }

    @Override
    public boolean updateUser(User u) {
        em.merge(u);
        return true;

    }

}
