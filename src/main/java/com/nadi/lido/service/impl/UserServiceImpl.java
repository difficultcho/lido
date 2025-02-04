package com.nadi.lido.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nadi.lido.entity.User;
import com.nadi.lido.mapper.UserMapper;
import com.nadi.lido.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author mzhang27
 * @since 2025/1/30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}