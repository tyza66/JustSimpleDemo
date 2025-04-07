package com.tyza66.demo4.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.tyza66.demo4.entity.Cat;
import com.tyza66.demo4.mapper.CatMapper;
import org.apache.ibatis.session.SqlSession;
import org.mutantcat.justsimple.annotation.Controller;
import org.mutantcat.justsimple.annotation.Handler;
import org.mutantcat.justsimple.dao.mybatis.Mybatis;
import org.mutantcat.justsimple.instance.InstanceHandler;

import java.util.List;

@Controller
public class CatController {
    // 注入 CatMapper
    CatMapper catMapper;

    public CatController() {
        // 获取 CatMapper 实例
        Mybatis mybatis = InstanceHandler.getInstance("mybatis");
        SqlSession session = mybatis.getSession();
        catMapper = mybatis.getMapper(session, CatMapper.class);
    }

    @Handler(path = "/cat/all")
    public JSON getAllCats() {
        // 获取所有猫
        List<Cat> allCats = catMapper.getAllCats();
        // 返回 JSON 格式的猫列表
        return JSONUtil.parse(allCats);
    }
}
