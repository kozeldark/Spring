package com.example.jenkinsut;
import com.example.jenkinsut.Service.JenkinsutService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JenkinsutTest {
    private JenkinsutService service = new JenkinsutService();

    @Test
    public void testHello(){
        assertEquals("My name is kozeldark", service.nameService("kozeldark"));
        assertEquals("My age is 25", service.ageService(25));
    }
}
