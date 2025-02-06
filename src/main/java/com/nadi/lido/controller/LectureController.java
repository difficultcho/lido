package com.nadi.lido.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nadi.lido.entity.Lecture;
import com.nadi.lido.service.LectureService;
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
@RequestMapping("/lecture")
public class LectureController {

    @PostMapping("/add")
    public String lectureAdd(@RequestBody Lecture lecture) {
        return lectureService.save(lecture) ? "add lecture success" : "add lecture fail";
    }

    @GetMapping("/del")
    public String lectureDel(Long id) {
        return lectureService.removeById(id) ? "delete lecture success" : "delete lecture fail";
    }

    @PostMapping("/update")
    public String lectureUpdate(@RequestBody Lecture lecture) {
        return lectureService.updateById(lecture) ? "update lecture success" : "update lecture fail";
    }

    @GetMapping("/page")
    public Object lecturePage(Page<Lecture> page) {
        return lectureService.page(page, Wrappers.emptyWrapper());
    }

    @Resource
    private LectureService lectureService;
}
