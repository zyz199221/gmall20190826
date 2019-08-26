package com.example.gmall.user.mapper;


import com.example.api.bean.UserMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UserMember> {
    List<UserMember> selectAllUser();
}
