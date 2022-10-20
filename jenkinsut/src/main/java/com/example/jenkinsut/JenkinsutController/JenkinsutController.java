package com.example.jenkinsut.JenkinsutController;

import com.example.jenkinsut.Service.JenkinsutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsutController {

    @Autowired
    private JenkinsutService service;

    @RequestMapping("/name")
    public String hello(@RequestParam("name") String name) {
        return service.nameService(name);
    }
    
    @RequestMapping("/age")
    public String hello(@RequestParam("age") int age) {
        return service.ageService(age);
    }
    
    @GetMapping("/home")
    public String helloEvery() {
        return "Jenkins Unit test";
    }
}
