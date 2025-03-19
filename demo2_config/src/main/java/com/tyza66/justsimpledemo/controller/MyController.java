package com.tyza66.justsimpledemo.controller;

import org.mutantcat.justsimple.annotation.Controller;
import org.mutantcat.justsimple.annotation.Handler;
import org.mutantcat.justsimple.request.Context;

@Controller
public class MyController {
    @Handler(path = "/hello")
    public String hello(Context ctx) {
        return "Hello, JustSimple!";
    }
}
