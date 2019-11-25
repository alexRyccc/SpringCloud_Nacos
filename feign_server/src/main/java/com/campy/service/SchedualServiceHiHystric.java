package com.campy.service;

import org.springframework.stereotype.Component;

/**
 * @author ran_ych
 * @create 2019-11-22  17:29
 * @desc
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {

            return "sorry "+name;

    }
}
