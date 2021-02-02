package com.etn.dset.springbootskillmatrix.skills;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsController {

    @Autowired
    private SkillService skillService;

    @RequestMapping("/skills")
    public List<Skill> getAllDsetSkill(){
        return skillService.getAllSkills();
    }
}