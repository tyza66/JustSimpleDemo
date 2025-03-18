package com.tyza66.justsimpledemo.instance;

import org.mutantcat.justsimple.annotation.Instance;

@Instance
public class MyInstance {
    public void sayHello() {
        System.out.println("Hello, JustSimple!");
    }
}
