package com.attendance.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.entity.login.LoginUser;
import com.attendance.entity.login.UserRegistration;
import com.attendance.login.repository.UserRegistrationDao;

@Service
public class LoginCheckServiceImpl implements LoginCheckService {
    @Autowired
    private UserRegistrationDao userRegistrationDao;

    @Override
    public LoginUser CheckUser(LoginUser userData) {
//        userData.setStatus(0);
        String mail = userData.getMail();
        
        // Log the email being queried
        System.out.println("Checking user with email: " + mail);
        
        Optional<UserRegistration> existUser = userRegistrationDao.findByMail(mail);
        
        if (existUser.isPresent()) {
            UserRegistration newUser = existUser.get();
            System.out.println("User found: " + newUser.getMail());
            
            if (newUser.getMail().equals(userData.getMail()) && newUser.getPassword().equals(userData.getPassword())) {
                userData.setStatus(1);
            }
        } else {
            System.out.println("No user found with email: " + mail);
        }
        
        return userData;
    }
}