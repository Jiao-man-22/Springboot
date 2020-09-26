package com.jiao.bootmybatis.services;

import com.jiao.bootmybatis.pojo.User;

import java.util.List;

public interface addUserService {
    public void addUser(User user);
    public boolean deleteUser(User user);
    public List<User> findUserAll();
    public User findOne(User user);
    public boolean updateUser(User user);

}
