package com.tyza66.demo4.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.tyza66.demo4.config.MybatisSqlSessionGetter;
import com.tyza66.demo4.entity.Class;
import com.tyza66.demo4.entity.User;
import com.tyza66.demo4.mapper.ClassMapper;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mutantcat.justsimple.annotation.Controller;
import org.mutantcat.justsimple.annotation.Handler;
import org.mutantcat.justsimple.instance.InstanceHandler;
import org.mutantcat.justsimple.request.Context;

import java.util.List;

@Controller
public class ClassesController {
    ClassMapper classMapper;

    public ClassesController() {
        MybatisSqlSessionGetter mybatis = (MybatisSqlSessionGetter) InstanceHandler.getInstance("mybatis");
        SqlSessionFactory sqlSessionFactory = mybatis.getSqlSessionFactory();
        Configuration configuration = sqlSessionFactory.getConfiguration();
        boolean isRegistered = configuration.hasMapper(ClassMapper.class);
        // 如果没有注册 ClassMapper，则注册它
        if (!isRegistered) {
            configuration.addMapper(ClassMapper.class);
        }
        classMapper = sqlSessionFactory.openSession().getMapper(ClassMapper.class);
    }

    @Handler(path = "/classes/all")
    public JSON getAllClasses(Context ctx) {
        // 获取所有课程
        List<Class> allClasses = classMapper.getAllClasses();
        // 返回 JSON 格式的课程列表
        return JSONUtil.parse(allClasses);
    }
}
