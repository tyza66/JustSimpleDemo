package com.tyza66.justsimpledemo;

import com.tyza66.justsimpledemo.instance.MyInstance;
import org.mutantcat.justsimple.Application;
import org.mutantcat.justsimple.annotation.JustSimple;
import org.mutantcat.justsimple.instance.InstanceHandler;

@JustSimple
public class Main {
    public static void main(String[] args) {
        Application.start(Main.class,args);
    }
}