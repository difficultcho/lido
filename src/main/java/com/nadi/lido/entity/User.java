package com.nadi.lido.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mzhang27
 * @since 2025/1/30
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    //ID
    @TableId(type = IdType.AUTO)
    private Integer id;

    // 姓名
    private String name;

    // 用户编码
    private String userCode;

    // 用户密码
    private String password;

    // 用户类型 学生 教师 管理员
    private String role;

    // 状态：valid 有效 invalid 无效
    private String status;

    // 小学
    private String elementarySchool;

    // 初中
    private String middleSchool;

    // 高中
    private String highSchool;

    // 大学
    private String college;

    // 联系电话
    private String phone;

    // 邮箱
    private String email;

    // 头像
    private String avatar;

    // 实名证件类型
    private String idType;

    // 实名证件号
    private String idNumber;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;
}
