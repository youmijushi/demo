package com.aaron.ssm.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aaron.ssm.db.UserMapper;
import com.aaron.ssm.model.User;
import com.aaron.ssm.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

    @Resource
    private UserMapper userDao;

    public int insert(User record) {
        return this.userDao.insert(record);
    }

}