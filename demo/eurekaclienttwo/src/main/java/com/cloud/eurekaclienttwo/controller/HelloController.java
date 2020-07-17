package com.cloud.eurekaclienttwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HelloController {

    @RequestMapping("index")
    public String index(){
        return "这是一个eurekaclient";
    }
//    @RequestMapping("/")
//    public void index(HttpServletResponse response) throws IOException {
//
//        response.sendRedirect("/templates/index.html");
//
//    }
}
