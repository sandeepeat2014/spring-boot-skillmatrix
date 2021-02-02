package com.etn.dset.springbootskillmatrix.skills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SkillService {
    private List<Skill> skills = new ArrayList<>(Arrays.asList(
        new Skill("java", "Java 8", "Java Description"),
        new Skill("dotnet", ".Net Core", "DotNetCore Description"),
        new Skill("python", "Pythod Quick start", "Python Description"),
        new Skill("Scala", "Scala Quick start", "ABC Description")
        )
    );
    
    public List<Skill> getAllSkills(){
        return skills;
    }

}
