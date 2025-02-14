package com.nadi.lido.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nadi.lido.entity.StudentTestGrade;
import com.nadi.lido.service.StudentTestGradeService;
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
@RequestMapping("/studentTestGrade")
public class StudentTestGradeController {

    @PostMapping("/add")
    public String studentTestGradeAdd(@RequestBody StudentTestGrade studentTestGrade) {
        return studentTestGradeService.save(studentTestGrade) ? "add studentTestGrade success" : "add studentTestGrade fail";
    }

    @GetMapping("/del")
    public String studentTestGradeDel(Long id) {
        return studentTestGradeService.removeById(id) ? "delete studentTestGrade success" : "delete studentTestGrade fail";
    }

    @PostMapping("/update")
    public String studentTestGradeUpdate(@RequestBody StudentTestGrade studentTestGrade) {
        return studentTestGradeService.updateById(studentTestGrade) ? "update studentTestGrade success" : "update studentTestGrade fail";
    }

    @GetMapping("/page")
    public Object studentTestGradePage(Page<StudentTestGrade> page) {
        return studentTestGradeService.page(page, Wrappers.emptyWrapper());
    }

    @Resource
    private StudentTestGradeService studentTestGradeService;
}
