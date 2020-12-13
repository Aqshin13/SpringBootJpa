package com.company.service.inter;

import com.company.entity.UserSkill;

import java.util.List;

public interface UserSkillServiceInter {

    List<UserSkill> getAllUserSkill();

    UserSkill getUserSkillById(int id);

    boolean removeUserSkill(int id);

    boolean updateUserSkill(UserSkill userSkills);

    boolean addUserSkill(UserSkill skills);

}
