package com.cloud.openfeign.conrtler;

import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    /**
     * GetMapping example with @RequestParam
     * @param userId
     * @return userName
     */
    @GetMapping("getUserName")
    public String getUserName(@RequestParam("userId") String userId){
        if("100".equals(userId)) {
            return "张学友";
        }else{
            return "刘德华";
        }
    }

}