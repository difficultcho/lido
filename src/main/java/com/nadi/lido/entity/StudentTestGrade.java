package com.nadi.lido.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mzhang27
 * @since 2025/2/5
 */
@Data
public class StudentTestGrade implements Serializable {

    private static final long serialVersionUID = 4713770416663761157L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    // 学生编码
    private String studentCode;

    // 考试科目
    private String test;

    // 考试时间
    private Date testTime;

    // 考试形式：实战、模考
    private String testType;

    // 考试成绩
    private String testGrade;

}
