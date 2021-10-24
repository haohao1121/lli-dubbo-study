package com.sky.lli.controller;

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
@RequestMapping("nacosDiscovery")
public class NacosDiscoveryController {

    @GetMapping("test")
    public String test() {
        return "success";
    }
}
