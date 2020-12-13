package com.company.dao.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.SkillDaoInter;
import com.company.entity.Skill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository(value = "skillDaoImpl")
@Transactional
public class SkillDaoImpl extends AbstractDAO implements SkillDaoInter {

    @PersistenceContext
    EntityManager em;


    @Override
    public List<Skill> getAllSkill() {
        String jpql = "select s skill s";
        Query query = em.createQuery(jpql);
        List<Skill> list = query.getResultList();
        return list;
    }

    @Override
    public Skill getSkillById(int id) {
        Skill u = em.find(Skill.class, id);
        return u;
    }

    @Override
    public boolean removeSkill(int id) {
        Skill skill = em.find(Skill.class, id);
        em.remove(skill);
        return false;
    }

    @Override
    public boolean updateSkill(Skill skill) {
        em.merge(skill);
        return true;
    }

    @Override
    public boolean addSkill(Skill skill) {
        em.persist(skill);
        return true;
    }

}
