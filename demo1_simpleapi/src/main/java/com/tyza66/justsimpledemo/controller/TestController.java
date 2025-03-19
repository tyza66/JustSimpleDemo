package com.tyza66.justsimpledemo.controller;

import com.tyza66.justsimpledemo.instance.NamedInstance;
import com.tyza66.justsimpledemo.service.TestService;
import io.netty.handler.codec.http.FullHttpRequest;
import org.mutantcat.justsimple.annotation.Controller;
import org.mutantcat.justsimple.annotation.Handler;
import org.mutantcat.justsimple.instance.InstanceHandler;
import org.mutantcat.justsimple.request.Context;

@Controller
public class TestController {
    TestService testService;
    NamedInstance namedInstance;

    public TestController() {
        this.testService = (TestService)InstanceHandler.getInstance(TestService.class.getName());
        this.namedInstance = (NamedInstance)InstanceHandler.getInstance("NamedInstance");
    }

    @Handler(path = "/service")
    public String serciveHandler(Context ctx) {
        return testService.sayHello();
    }

    @Handler(path = "/named_service")
    public String namedInstance(Context ctx) {
        return namedInstance.sayHello();
    }

    @Handler(path = "/hello")
    public String helloHandler() {
        return service() + "Hello, JustSimple!";
    }

    @Handler(path = "/ping")
    public String pingHandler(Context ctx) {
        return "pong";
    }

    @Handler(path = "/req")
    public String reqHandler(Context ctx) {
        return ctx.getFullHttpRequest().toString();
    }

    public String service() {
        return "service: ";
    }
}
