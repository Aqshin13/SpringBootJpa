package com.company.dao.inter;

import com.company.entity.Skill;

import java.util.List;

public interface SkillDaoInter {

    List<Skill> getAllSkill();

    Skill getSkillById(int id);

    boolean removeSkill(int id);

    boolean updateSkill(Skill skill);

    boolean addSkill(Skill skill);

}
