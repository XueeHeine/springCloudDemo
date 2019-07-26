package com.ylzpay.controller;

import com.ylzpay.SchdualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuee on 2019/7/26.
 */
@RestController
public class HiController {

    @Autowired
    SchdualServiceHi schdualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schdualServiceHi.sayHiFromClientOne( name);
    }
}
