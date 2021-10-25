package com.sky.lli.service.impl;

import com.sky.lli.service.TestConsumerService;
import com.sky.lli.service.TestProviderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * @author lihao
 * @date 2021/10/25
 */
@Service
@DubboService(version = "1.0.0")
public class TestConsumerServiceImpl implements TestConsumerService {

    @Autowired
    private TestProviderService testProviderService;

    /**
     * 测试方法
     *
     * @param name 参数
     * @return 结果
     */
    @Override
    public String helloWorld(String name) {
        return testProviderService.sayHello(name);
    }
}
