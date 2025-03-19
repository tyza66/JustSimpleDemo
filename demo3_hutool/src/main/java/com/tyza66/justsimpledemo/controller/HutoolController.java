package com.tyza66.justsimpledemo.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import org.mutantcat.justsimple.annotation.Controller;
import org.mutantcat.justsimple.annotation.Handler;
import org.mutantcat.justsimple.request.Context;

import java.util.HashMap;

@Controller
public class HutoolController {

    @Handler(path="/hutool")
    public JSON hutool(Context ctx) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("name", "hutool");
        return JSONUtil.parseObj(stringStringHashMap);
    }
}
