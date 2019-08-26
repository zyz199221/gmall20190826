package com.example.api.service;

import com.example.api.bean.UserMember;

import java.util.List;

/**
 * 文件名：UserService
 * 作 者：Miles zhu
 * 时 间：2019/8/26 15:26
 * -------------------------
 * 功能和描述：
 **/
public interface UserService {
    List<UserMember> getList();
}
