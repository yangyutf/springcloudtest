package com.cloud.openfeignlient.service;

import com.cloud.openfeignlient.Hird.ServiceFallback;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "openfeign-server", fallback= ServiceFallback.class)
@RequestMapping(path = "/user")
public interface UserClienta {

    @GetMapping("getUserName")
    public String getUserName(@RequestParam("userId") String userId);
   }