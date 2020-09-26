package com.jiao.bootmybatis.services.impl;
import com.jiao.bootmybatis.mapper.UserMapper;
import com.jiao.bootmybatis.pojo.User;
import com.jiao.bootmybatis.services.addUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户管理业务层
 * */
@Service
@Transactional
public class addUserImpl implements addUserService {
    @Resource
    UserMapper userMapper;
    private boolean flag=false;
    @Override
    public void addUser(User user) {
        this.userMapper.addUser(user);
    }

    @Override
    public boolean deleteUser(User user) {
        if (user!=null){
            flag=true;
            this.userMapper.deleteUser(user);
        }
        return flag;
    }

    @Override
    public List<User> findUserAll() {
        List<User> userAll = this.userMapper.findUserAll();
        if (userAll!=null){
            return userAll;
        }
        return null;
    }

    @Override
    public User findOne(User user) {
        User one = this.userMapper.findOne(user);
        if (one!=null){
            return one;
        }
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        if (user!=null){
            flag=true;
            this.userMapper.updateUser(user);
            return flag;
        }
        return flag;
    }
}
