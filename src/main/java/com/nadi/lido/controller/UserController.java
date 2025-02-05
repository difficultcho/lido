package com.nadi.lido.controller;

import com.nadi.lido.entity.Lecture;
import com.nadi.lido.entity.StudentTestGrade;
import com.nadi.lido.entity.User;
import com.nadi.lido.service.LectureService;
import com.nadi.lido.service.StudentTestGradeService;
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
        Optional<Lecture> lecture = lectureService.list().stream().findAny();
        Optional<StudentTestGrade> studentTestGrade = studentTestGradeService.list().stream().findAny();
        Optional<User> user = userService.list().stream().findAny();
        return user.map(User::getName).orElse("No user found");
    }

    @Resource
    private UserService userService;

    @Resource
    private LectureService lectureService;

    @Resource
    private StudentTestGradeService studentTestGradeService;
}
