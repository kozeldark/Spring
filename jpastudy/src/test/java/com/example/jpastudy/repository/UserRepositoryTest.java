package com.example.jpastudy.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.jpastudy.JpastudyApplicationTests;
import com.example.jpastudy.model.User;


public class UserRepositoryTest extends JpastudyApplicationTests {
	

    //UserRepository userRepository = new UserRepository();
    // DI = Dependency Injection
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        // String sql = insert into user(%s, %s, %d) value(account, email, age);
        User user = new User();
//        user.setId(); auto increment
        String account ="chanhee";
        String email = "chanhee@gmail.com";
        String phoneNumber = "010-1111-1111";
        LocalDateTime createdAt = LocalDateTime.now();
        String setCreatedBy = "chanhee";
        user.setAccount(account);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(setCreatedBy);

       User newUser = userRepository.save(user);
       System.out.println("newUser" + newUser);

    }
    
    @Test
    public void read(){
    	Optional<User> user = userRepository.findById(1L);
    	
    	user.ifPresent(selectUser -> {
    		System.out.println("user : " + selectUser.toString());
    		
    	});
    	

    }

    @Test
    public void update(){
    	Optional<User> user = userRepository.findById(2L);
    	
    	user.ifPresent(selectUSer -> {
    		selectUSer.setAccount("updated");
    		selectUSer.setUpdatedAt(LocalDateTime.now());
    		selectUSer.setUpdatedBy("update method()");

    		userRepository.save(selectUSer);
    	});
    }
    
    
    @Test
    @Transactional 
    public void delete() {
    	Optional<User> user = userRepository.findById(1L);
    	
//    	Assert.assertTrue(user.isPresent());
    	
    	assertTrue(user.isPresent());
    	
    	user.ifPresent(selectUser -> {
    		userRepository.delete(selectUser);
    	});
    	
    	Optional<User> deleteUser = userRepository.findById(1L);
    	
    	assertFalse(deleteUser.isPresent());

    }
    

}