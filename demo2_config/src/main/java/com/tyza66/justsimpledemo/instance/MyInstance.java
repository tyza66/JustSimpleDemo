package com.tyza66.justsimpledemo.instance;

import org.mutantcat.justsimple.annotation.Instance;
import org.mutantcat.justsimple.instance.InstanceHandler;

@Instance
public class MyInstance {
    public String hello() {
        InstanceHandler.putInstance("MyInstance", this);
        InstanceHandler.getInstance("MyInstance");
        return "Hello, JustSimple!";
    }
}
