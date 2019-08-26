package com.example.gmall.user.controller;

import com.example.api.bean.UserMember;
import com.example.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 文件名：UserController
 * 作 者：Miles zhu
 * 时 间：2019/8/26 10:36
 * -------------------------
 * 功能和描述：
 **/

@Controller
public class UserController {
    @Autowired
    UserService userService;


    @ResponseBody
    @RequestMapping("/user")
    public String HelloUser() {
        return "UserHello";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<UserMember> getAllUSer() {
        List<UserMember> list = userService.getList();
        return list;
    }
}
