package com.tyza66.demo4.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mutantcat.justsimple.annotation.Instance;

import java.io.InputStream;

@Instance(name = "mybatis")
public class MybatisSqlSessionGetter {

    private static SqlSessionFactory sqlSessionFactory;
    public MybatisSqlSessionGetter() {
        try {
            String resource = "mybatis-config.xml";
            // 判断资源是否存在
            if (getClass().getClassLoader().getResource(resource) != null) {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
