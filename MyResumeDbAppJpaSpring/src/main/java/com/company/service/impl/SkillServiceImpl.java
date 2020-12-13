package com.company.service.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.SkillDaoInter;
import com.company.entity.Skill;
import com.company.service.inter.SkillServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service("skillService")
@Transactional
public class SkillServiceImpl extends AbstractDAO implements SkillServiceInter {

    @Autowired
    @Qualifier("skillDaoImpl")
    SkillDaoInter skillDaoInter;


    @Override
    public List<Skill> getAllSkill() {
     return skillDaoInter.getAllSkill();
    }

    @Override
    public Skill getSkillById(int id) {
       return skillDaoInter.getSkillById(id);
    }

    @Override
    public boolean removeSkill(int id) {
       return skillDaoInter.removeSkill(id);
    }

    @Override
    public boolean updateSkill(Skill skill) {
       return skillDaoInter.updateSkill(skill);
    }

    @Override
    public boolean addSkill(Skill skill) {
        return skillDaoInter.addSkill(skill);
    }

}
