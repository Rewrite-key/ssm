package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("name="+name);
        System.out.println("age="+age);
        return "{'module':'common param'}";
    }
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save");
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> list){
        System.out.println("list common(json)参数传递list："+list);
        return "{'module':'listParamForJson'}";
    }

}
