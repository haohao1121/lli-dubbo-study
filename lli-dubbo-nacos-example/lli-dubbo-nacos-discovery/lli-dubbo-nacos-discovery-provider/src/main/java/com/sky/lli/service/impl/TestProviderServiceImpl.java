package com.sky.lli.service.impl;

import com.sky.lli.service.TestProviderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * @author lihao
 * @date 2021/10/25
 */

@Service
@DubboService(version = "1.0.0")
public class TestProviderServiceImpl implements TestProviderService {

    /**
     * 测试方法
     *
     * @param name 参数
     * @return 结果
     */
    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }
}
