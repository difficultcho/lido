package com.nadi.lido.controller;

import com.nadi.lido.entity.User;
import com.nadi.lido.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author mzhang27
 * @since 2025/1/30
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/samples")
    public String getSample() {
        Optional<User> user = userService.list().stream().findAny();
        return user.map(User::getName).orElse("No user found");
    }

    @Resource
    private UserService userService;
}
