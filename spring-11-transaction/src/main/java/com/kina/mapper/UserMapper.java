package com.kina.mapper;

import com.kina.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    // 添加
    public int addUser(User user);

    // 删除
    public int deleteUser(int id);
}
