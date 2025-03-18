package com.tyza66.justsimpledemo.controller;

import org.mutantcat.justsimple.annotation.Controller;
import org.mutantcat.justsimple.annotation.Handler;
import org.mutantcat.justsimple.annotation.Instance;
import org.mutantcat.justsimple.request.Context;
import org.mutantcat.justsimple.web.FileUploadHandler;

import java.io.IOException;
import java.util.List;

@Controller
@Instance
public class SingletonController {

    String name = "123";

    @Handler(path = "/getInfo")
    public String getInfo(Context ctx) {
        return name;
    }

    @Handler(path = "/testmany")
    public String testMany(Context ctx) {
        // 获得get请求参数
        List<String> name1 = ctx.getParam("name");
        if (name1.size() > 0) {
            return "hello" + name1.get(0);
        }
        return "你没传get参数";
    }

    @Handler(path = "/testjson")
    public String testjson(Context ctx) {
        System.out.println(ctx.getJson());
        return "ok";
    }

    @Handler(path = "/testform")
    public String testform(Context ctx) throws IOException {
        //System.out.println(ctx.getFormData());
        Object param = ctx.getFormDataByKey("3");
        FileUploadHandler.TempFile file = ctx.getFileUploadByKey("file");
        FileUploadHandler.saveByteBufToFile(file.getByteBuf(), "D:/test.txt");
        System.out.println(param);
        return "ok";
    }

    @Handler(path = "/singleton")
    public String setInfo(Context ctx) {
        // 获得get请求参数
        String name = ctx.getParam("name").get(0);
        this.name = name;
        return "success";
    }
}
