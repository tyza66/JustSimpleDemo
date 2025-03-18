package com.tyza66.justsimpledemo.instance;

import org.mutantcat.justsimple.annotation.Instance;

@Instance(name = "NamedInstance")
public class NamedInstance {
    public String sayHello() {
        return "Hello, NamedInstance!";
    }
}
