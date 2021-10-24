package com.sky.lli.service.impl;

import com.sky.lli.service.TestDubboService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 描述:
 *
 * @author lihao
 * @date 2021/10/24
 */
@DubboService
public class TestDubboServiceImpl implements TestDubboService {
    /**
     * test service
     *
     * @param name name
     */
    @Override
    public String sayHello(String name) {
        return "你好," + name;
    }
}
