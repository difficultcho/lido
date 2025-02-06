package com.nadi.lido.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author mzhang27
 * @since 2025/2/5
 */
@Data
public class UserLecture implements Serializable {

    private static final long serialVersionUID = 4713771414663769157L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    // 用户编码
    private String userCode;

    // 课堂角色
    private String role;

    // 课程学期
    private String lectureTerm;

    // 课程类别（反应课程内容如 TOEFL）
    private String lectureType;

    // 课程 session
    private String lectureSession;

    // 退课/完成/待上 等状态
    private String status;

}
