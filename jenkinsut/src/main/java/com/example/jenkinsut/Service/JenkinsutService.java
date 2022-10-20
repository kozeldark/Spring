package com.example.jenkinsut.Service;

import org.springframework.stereotype.Service;

@Service
public class JenkinsutService {
    public String nameService(String name){
        return "My name is "+name;
    }
    
    public String ageService(int age){
        return "My age is "+age;
    }
}

