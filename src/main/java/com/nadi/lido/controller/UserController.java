package com.nadi.lido.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nadi.lido.entity.User;
import com.nadi.lido.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mzhang27
 * @since 2025/1/30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/add")
    public String userAdd(@RequestBody User user) {
        return userService.save(user) ? "add user success" : "add user fail";
    }

    @GetMapping("/del")
    public String userDel(Long id) {
        return userService.removeById(id) ? "delete user success" : "delete user fail";
    }

    @PostMapping("/update")
    public String userUpdate(@RequestBody User user) {
        return userService.updateById(user) ? "update user success" : "update user fail";
    }

    @GetMapping("/page")
    public Object userPage(Page<User> page) {
        return userService.page(page, Wrappers.emptyWrapper());
    }

    @Resource
    private UserService userService;
}
