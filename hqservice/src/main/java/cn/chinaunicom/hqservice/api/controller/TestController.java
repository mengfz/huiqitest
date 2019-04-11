package cn.chinaunicom.hqservice.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/user")
    @ResponseBody
    public Map getUser(){
        Map retMap = new HashMap();
        retMap.put("username","mengfanzhen");
        retMap.put("password","123456");
        return retMap;
    }
}
