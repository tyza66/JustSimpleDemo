package com.tyza66.demo4.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.tyza66.demo4.config.MybatisSqlSessionGetter;
import com.tyza66.demo4.entity.User;
import com.tyza66.demo4.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.mutantcat.justsimple.annotation.Controller;
import org.mutantcat.justsimple.annotation.Handler;
import org.mutantcat.justsimple.dao.mybatis.Mybatis;
import org.mutantcat.justsimple.instance.InstanceHandler;

import java.util.List;

@Controller
public class UserController {

    UserMapper userMapper;

    public UserController() {
        Mybatis mybatis = InstanceHandler.getInstance("mybatis");
        SqlSession session = mybatis.getSession();
        userMapper = mybatis.getMapper(session, UserMapper.class);
    }

    @Handler(path = "/user/all")
    public JSON getAllUsers() {
        List<User> allUsers = userMapper.getAllUsers();
        return JSONUtil.parse(allUsers);
    }

}
