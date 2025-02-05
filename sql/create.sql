CREATE TABLE `user` (
                        `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
                        `name` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '中文名',
                        `user_code` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '用户唯一标识码',
                        `password` varchar(512) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '密码密文',
                        `role` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '用户角色枚举',
                        `status` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '有效/无效',
                        `elementary_school` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '小学',
                        `middle_school` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '初中',
                        `high_school` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '高中',
                        `college` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '大学',
                        `phone` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '电话',
                        `email` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '邮箱',
                        `avatar` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '头像',
                        `id_type` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '实名证件类型',
                        `id_number` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '实名证件号',
                        `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        `update_time` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '修改时间',
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `uniq_user_code` (`user_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `lecture` (
                           `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
                           `lecture_start_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '上课时间',
                           `lecture_end_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '下课时间',
                           `classroom_location` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '教室',
                           `lecture_term` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '学期编号',
                           `lecture_type` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '课程种类，如：托福',
                           `lecture_session` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'session',
                           `lecture_name` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '中文名',
                           `lecturers` varchar(512) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '讲师编码，逗号分隔',
                           `assistants` varchar(512) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '助教编码，逗号分隔',
                           `students` varchar(2048) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '学生编码，逗号分隔',
                           `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                           `update_time` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '修改时间',
                           PRIMARY KEY (`id`),
                           UNIQUE KEY `uniq_term_type_session` (`lecture_term`,`lecture_type`,`lecture_session`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `student_test_grade` (
                                      `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
                                      `student_code` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '学生唯一编码',
                                      `test` varchar(256) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '考试名，如：TOEFL',
                                      `test_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '考试时间',
                                      `test_type` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '实战/模考',
                                      `test_grade` varchar(128) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '成绩',
                                      PRIMARY KEY (`id`),
                                      UNIQUE KEY `uniq_student_test_time_type` (`student_code`,`test`,`test_time`,`test_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci