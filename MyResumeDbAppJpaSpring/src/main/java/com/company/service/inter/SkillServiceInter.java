package com.company.service.inter;

import com.company.entity.Skill;

import java.util.List;

public interface SkillServiceInter {

    List<Skill> getAllSkill();

    Skill getSkillById(int id);

    boolean removeSkill(int id);

    boolean updateSkill(Skill skill);

    boolean addSkill(Skill skill);

}
