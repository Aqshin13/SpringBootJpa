package com.company.dao.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.UserSkill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository(value = "userSkillDaoImpl")
@Transactional
public class UserSkillDaoImpl extends AbstractDAO implements UserSkillDaoInter {

    @PersistenceContext
    EntityManager em;


    @Override
    public List<UserSkill> getAllUserSkill() {
        Query query = em.createNamedQuery("UserSkill.findAll", UserSkill.class);
        List<UserSkill> list = query.getResultList();
        return list;
    }

    @Override
    public UserSkill getUserSkillById(int id) {
        UserSkill u = em.find(UserSkill.class, id);
        return u;
    }

    @Override
    public boolean removeUserSkill(int id) {
        UserSkill userSkill = em.find(UserSkill.class, id);
        em.remove(userSkill);
        return false;
    }

    @Override
    public boolean updateUserSkill(UserSkill userSkills) {
        em.merge(userSkills);
        return true;
    }

    @Override
    public boolean addUserSkill(UserSkill skills) {
        em.persist(skills);
        return true;
    }

}
