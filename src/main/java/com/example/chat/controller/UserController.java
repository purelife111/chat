package com.example.chat.controller;

import com.example.chat.dao.model.User;
import com.example.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/getUser/{id}", produces = {"application/json;charset=UTF-8"})
    public Object getUser(@PathVariable("id") int id) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT *  FROM user");
        //System.out.println(resultSet.get);
        List ls = resultSetToList(resultSet);
        Iterator it = ls.iterator();
        while(it.hasNext()) {
            Map hm = (Map)it.next();
            System.out.println(hm.get("name"));
        }
        return userService.getUser(1);
    }


    public static List resultSetToList(ResultSet rs) throws java.sql.SQLException {
        if (rs == null)
            return Collections.EMPTY_LIST;
        ResultSetMetaData md = rs.getMetaData(); //得到结果集(rs)的结构信息，比如字段数、字段名等
        int columnCount = md.getColumnCount(); //返回此 ResultSet 对象中的列数
        List list = new ArrayList();
        Map rowData = new HashMap();
        while (rs.next()) {
            rowData = new HashMap(columnCount);
            for (int i = 1; i <= columnCount; i++) {
                rowData.put(md.getColumnName(i), rs.getObject(i));
            }
            list.add(rowData);
            System.out.println("list:" + list.toString());
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/regist", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String regist(@RequestBody User user){
        return userService.regist(user);
    }
}