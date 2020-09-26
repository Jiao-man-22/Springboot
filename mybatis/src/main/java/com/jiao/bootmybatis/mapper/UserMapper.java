package com.jiao.bootmybatis.mapper;

import com.jiao.bootmybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    public void addUser(User u);
    public void deleteUser(User u);
    public List<User> findUserAll();
    public User findOne(User u);
    public void updateUser(User u);
}
