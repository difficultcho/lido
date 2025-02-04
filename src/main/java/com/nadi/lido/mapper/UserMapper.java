package com.nadi.lido.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nadi.lido.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author mzhang27
 * @since 2025/1/30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}