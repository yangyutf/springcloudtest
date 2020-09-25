package com.cloud.openfeignlient.contrler;

import com.cloud.openfeignlient.service.UserClienta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserClienta userClient;

    @GetMapping("getname")
    public void getUserName(){
        System.out.print(userClient.getUserName("100"));
    }
}