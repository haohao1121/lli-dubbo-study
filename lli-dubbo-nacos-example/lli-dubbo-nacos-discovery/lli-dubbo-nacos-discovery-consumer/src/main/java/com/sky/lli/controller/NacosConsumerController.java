package com.sky.lli.controller;

import com.sky.lli.service.TestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author lihao
 * @date 2021/10/23
 */

@RestController
@RequestMapping("nacosConsumer")
public class NacosConsumerController {

    @Autowired
    private TestConsumerService testConsumerService;

    @GetMapping("test")
    public String test(String name) {
        testConsumerService.helloWorld(name);
        return "success";
    }
}
