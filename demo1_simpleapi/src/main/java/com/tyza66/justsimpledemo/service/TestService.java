package com.tyza66.justsimpledemo.service;

import org.mutantcat.justsimple.annotation.Instance;

@Instance
public class TestService {

    // 实例必须有无参构造
    public TestService() {
        System.out.println("TestService instance created!");
    }

    public String sayHello() {
        System.out.println("Hello, JustSimple!");
        return "JustSimple Service.";
    }
}
