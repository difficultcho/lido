package com.nadi.lido.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author mzhang27
 * @since 2025/1/30
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;  //ID
    private String name;  //姓名

    @TableField(exist = false)
    private String username; //用户名
    @TableField(exist = false)
    private String password;  //密码
    @TableField(exist = false)
    private Integer type;  //用户类型 0学生 1教师  2管理员
    @TableField(exist = false)
    private Integer disabled;  //是否可用
    @TableField(exist = false)
    private Integer contrastStudentID; //对应学生ID
    @TableField(exist = false)
    private Integer contrastTeacherID;  //对应老师ID
    @TableField(exist = false)
    private String contrastStudentName; //对应学生姓名
    @TableField(exist = false)
    private String contrastTeacherName; //对应老师姓名
    @TableField(exist = false)
    private Integer classNO; //对应学生班级
    @TableField(exist = false)
    private String captcha; //验证码
}
