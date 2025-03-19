package com.tyza66.justsimpledemo;

import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.cors.CorsConfig;
import io.netty.handler.codec.http.cors.CorsConfigBuilder;
import org.mutantcat.justsimple.instance.InstanceHandler;

public class ConfigHandler {
    public static String[] doConfig(String[] args) {
        // 配置信息 可以存入一个配置类的 当然这个配置实例也可以使用@Instance注解自动注册
//        CorsConfig corsConfig = CorsConfigBuilder.forAnyOrigin() // 允许任意来源
//                .allowNullOrigin() // 允许空的来源
//                .allowedRequestMethods(HttpMethod.GET) // 允许的方法
//                .allowedRequestHeaders("*") // 允许任意请求头
//                .exposeHeaders("X-Custom-Header") // 暴露自定义的响应头
//                .maxAge(3600) // 设置预检请求的缓存时间（单位秒）
//                .build();
        CorsConfig corsConfig = CorsConfig.withAnyOrigin()
                .allowedRequestMethods(HttpMethod.GET) // 只允许 GET 请求
                .build();
        InstanceHandler.putInstance("CorsConfigInstanceName",corsConfig);

        Integer port = 8082;
        InstanceHandler.putInstance("portConfigName",port);

        // 新的参数 格式用于指定配置类的实例名称
        String[] newParams = {"corsConfig:CorsConfigInstanceName","port:portConfigName"};

        // 合并原参数与新参数
        String[] updatedArgs = new String[args.length + newParams.length];
        System.arraycopy(args, 0, updatedArgs, 0, args.length);
        System.arraycopy(newParams, 0, updatedArgs, args.length, newParams.length);
        return updatedArgs;
    }
}
