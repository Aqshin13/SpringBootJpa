package com.company.service.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.UserSkill;
import com.company.service.inter.UserSkillServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service("userSkillService")
@Transactional
public class UserSkillServiceImpl extends AbstractDAO implements UserSkillServiceInter {

    @Autowired
    @Qualifier("userSkillDaoImpl")
    UserSkillDaoInter userSkillDaoInter;

    @Override
    public List<UserSkill> getAllUserSkill() {
        return userSkillDaoInter.getAllUserSkill();
    }

    @Override
    public UserSkill getUserSkillById(int id) {
        return userSkillDaoInter.getUserSkillById(id);
    }

    @Override
    public boolean removeUserSkill(int id) {
        return userSkillDaoInter.removeUserSkill(id);
    }

    @Override
    public boolean updateUserSkill(UserSkill userSkills) {
        return userSkillDaoInter.updateUserSkill(userSkills);
    }

    @Override
    public boolean addUserSkill(UserSkill skills) {
        return userSkillDaoInter.addUserSkill(skills);
    }

}
