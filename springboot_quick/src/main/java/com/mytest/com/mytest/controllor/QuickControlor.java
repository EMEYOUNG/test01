package com.mytest.com.mytest.controllor;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")
public class QuickControlor {
    //    @Value("${name}")
    private String name;
//    @Value("${person.name}")
    private String addr;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){

        return "你好:"+name+",地址："+addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
