package com.wuwix.employeeportal.controllers;

import com.wuwix.employeeportal.dao.UserDao;
import com.wuwix.employeeportal.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RequestMapping
@RestController
public class MainController {

    @GetMapping("/save")
    public User saveUserController() {
        User user = new User("ynco1@wp.pl", "Wawrzyniec", new BigDecimal(20000.00));
        userDao.persist(user);
        return user;
    }

    @GetMapping("/update")
    public User updateUserController() {
        User user = new User("ynco1@wp.pl", "Wawrzyniec", new BigDecimal(20000.00));
        userDao.merge(user);

        return user;
    }

    @GetMapping("/drop")
    public User dropUserController() {
        User user = new User("ynco1@wp.pl", "Wawrzyniec", new BigDecimal(20000.00));
        userDao.drop();

        return user;
    }

    @Autowired
    private UserDao userDao;

}
