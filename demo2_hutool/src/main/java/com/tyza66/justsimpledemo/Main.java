package com.tyza66.justsimpledemo;

import org.mutantcat.justsimple.Application;
import org.mutantcat.justsimple.annotation.JustSimple;

@JustSimple
public class Main {
    public static void main(String[] args) {
        Application.start(Main.class,args);
    }
}