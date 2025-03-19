package com.tyza66.justsimpledemo;

import org.mutantcat.justsimple.Application;
import org.mutantcat.justsimple.annotation.JustSimple;

@JustSimple // 可指定packageName为基础包包名
public class Main {
    public static void main(String[] args) {
        // 一句话启动
        Application.start(Main.class,args);
    }
}