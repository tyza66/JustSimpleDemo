package com.tyza66.justsimpledemo.instance;

import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.cors.CorsConfigBuilder;
import org.mutantcat.justsimple.annotation.Instance;
import org.mutantcat.justsimple.instance.InstanceHandler;

//@Instance
public class CorsConfig {

//    public CorsConfig() {
//        // 这样调用实例的构造方法，会将配置实例放入实例池中
//        InstanceHandler.putInstance("CorsConfigInstanceName",  CorsConfigBuilder.forAnyOrigin() // 允许任意来源
//                .allowNullOrigin() // 允许空的来源
//                .allowedRequestMethods(HttpMethod.GET, HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE) // 允许的方法
//                .allowedRequestHeaders("*") // 允许任意请求头
//                .exposeHeaders("X-Custom-Header") // 暴露自定义的响应头
//                .maxAge(3600) // 设置预检请求的缓存时间（单位秒）
//                .build());
//    }
}
