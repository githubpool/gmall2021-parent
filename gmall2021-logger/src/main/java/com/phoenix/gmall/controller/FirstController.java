package com.phoenix.gmall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huangfeng
 */
@RestController
public class FirstController {

    @RequestMapping("/testDemo")
    public String test(@RequestParam("name") String name,
                       @RequestParam("age") int age) {
        System.out.println("name:" + name + ",age:" + age);
        return "SUCCESS";
    }
}
