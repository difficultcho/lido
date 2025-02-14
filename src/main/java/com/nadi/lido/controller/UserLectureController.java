package com.nadi.lido.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nadi.lido.entity.UserLecture;
import com.nadi.lido.service.UserLectureService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mzhang27
 * @since 2025/2/5
 */
@RestController
@RequestMapping("/userLecture")
public class UserLectureController {

    @PostMapping("/add")
    public String userLectureAdd(@RequestBody UserLecture userLecture) {
        return userLectureService.save(userLecture) ? "add userLecture success" : "add userLecture fail";
    }

    @GetMapping("/del")
    public String userLectureDel(Long id) {
        return userLectureService.removeById(id) ? "delete userLecture success" : "delete userLecture fail";
    }

    @PostMapping("/update")
    public String userLectureUpdate(@RequestBody UserLecture userLecture) {
        return userLectureService.updateById(userLecture) ? "update userLecture success" : "update userLecture fail";
    }

    @GetMapping("/page")
    public Object userLecturePage(Page<UserLecture> page) {
        return userLectureService.page(page, Wrappers.emptyWrapper());
    }

    @Resource
    private UserLectureService userLectureService;
}
