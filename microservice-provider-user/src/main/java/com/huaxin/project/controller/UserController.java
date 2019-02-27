package com.huaxin.project.controller;

import com.huaxin.project.dao.UserDao;
import com.huaxin.project.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return this.userDao.findOne(id);
    }
}
