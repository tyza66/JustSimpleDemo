package com.tyza66.justsimpledemo;

import org.mutantcat.justsimple.Application;
import org.mutantcat.justsimple.annotation.JustSimple;


@JustSimple // 可指定packageName为基础包包名
public class Main {
    public static void main(String[] args) {
        // 配置信息
        args = ConfigHandler.doConfig(args);
        // 配置信息
        Application.start(Main.class,args);
    }
}