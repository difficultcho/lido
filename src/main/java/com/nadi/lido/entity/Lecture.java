package com.nadi.lido.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author mzhang27
 * @since 2025/2/5
 */
@Data
public class Lecture implements Serializable {

    private static final long serialVersionUID = 4713371416163760127L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    // 课程起始日期时间
    private Date lectureStartTime;

    // 课程结束日期时间
    private Date lectureEndTime;

    // 教室位置
    private String classroomLocation;

    // 课程学期
    private String lectureTerm;

    // 课程类别（反应课程内容如 TOEFL）
    private String lectureType;

    // 课程 session（构成学期-类别-session联合唯一键）
    private String lectureSession;

    // 课程名称
    private String lectureName;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;
}
