package com.sky.lli.controller;

import com.sky.lli.config.nacos.TestJsonConfig;
import com.sky.lli.config.nacos.TestPropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 *
 * @author lihao
 * @date 2021/10/23
 */

@RestController
@RequestMapping("nacosTest")
public class NacosTestController {

    @Autowired
    private TestJsonConfig testJsonConfig;
    @Autowired
    private TestPropertiesConfig testPropertiesConfig;


    @GetMapping("test")
    @ResponseBody
    public Map<String, Object> testNacos() {
        Map<String, Object> map = new HashMap<>();
        map.put("json", testJsonConfig.toString());
        map.put("properties", testPropertiesConfig.toString());
        return map;
    }
}
