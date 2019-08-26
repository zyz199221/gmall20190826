package com.example.gmall.user.service.impl;

import com.example.api.bean.UserMember;
import com.example.api.service.UserService;
import com.example.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件名：UserServiceImpl
 * 作 者：Miles zhu
 * 时 间：2019/8/26 15:26
 * -------------------------
 * 功能和描述：
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserMapper userMapper;


    @Override
    public List<UserMember> getList() {
        return userMapper.selectAllUser();
    }
}
