package com.nadi.lido.controller;

import com.nadi.lido.entity.User;
import com.nadi.lido.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mzhang27
 * @since 2025/1/30
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/samples")
    public String getSample() {
        return "hello world";
    }

    @Resource
    private UserService userService;
}
