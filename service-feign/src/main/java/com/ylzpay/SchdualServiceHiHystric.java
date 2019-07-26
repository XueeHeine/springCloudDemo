package com.ylzpay;

import org.springframework.stereotype.Component;

/**
 * Created by xuee on 2019/7/26.
 */
@Component
public class SchdualServiceHiHystric implements  SchdualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
