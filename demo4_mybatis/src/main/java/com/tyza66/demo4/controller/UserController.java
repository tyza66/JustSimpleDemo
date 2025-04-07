package com.tyza66.demo4.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.tyza66.demo4.config.MybatisSqlSessionGetter;
import com.tyza66.demo4.entity.User;
import com.tyza66.demo4.mapper.UserMapper;
import org.mutantcat.justsimple.annotation.Controller;
import org.mutantcat.justsimple.annotation.Handler;
import org.mutantcat.justsimple.instance.InstanceHandler;
import org.mutantcat.justsimple.request.Context;

import java.util.List;

@Controller
public class UserController {

    UserMapper userMapper;

    public UserController() {
        MybatisSqlSessionGetter mybatis = (MybatisSqlSessionGetter) InstanceHandler.getInstance("mybatis");
        userMapper = mybatis.getSqlSessionFactory().openSession().getMapper(UserMapper.class);
    }

    @Handler(path = "/user/all")
    public JSON getAllUsers(Context ctx) {
        List<User> allUsers = userMapper.getAllUsers();
        return JSONUtil.parse(allUsers); // 返回空数组作为示例
    }

}
