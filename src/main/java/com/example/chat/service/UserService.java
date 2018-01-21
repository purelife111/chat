package com.example.chat.service;

import com.example.chat.dao.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
public interface UserService {

    int addUser(User user);

    User getUser(int id);

    String regist(User user);
}