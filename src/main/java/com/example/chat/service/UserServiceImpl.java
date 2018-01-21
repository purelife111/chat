package com.example.chat.service;

import com.example.chat.dao.mapper.UserMapper;
import com.example.chat.dao.model.User;
import com.example.chat.dao.model.UserExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }

    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
    @Override
    public User getUser(int id) {
        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    public String regist(User user) {
        if (user!=null && !StringUtils.isEmpty(user.getName()) && !StringUtils.isEmpty(user.getPassword())){
            UserExample example = new UserExample();
            example.createCriteria().andNameEqualTo(user.getName());
            List<User> userList = userMapper.selectByExample(example);
            if (CollectionUtils.isEmpty(userList)){
                userMapper.insertSelective(user);
            } else{
                return "Name already in use!";
            }
        }
        return "succ";
    }
}