package com.sky.lli.service.dubbo.consumer;

import com.sky.lli.service.TestProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述: dubbo引用,一次定义,使用的地方直接使用 @Autowired 使用
 *
 * @author lihao
 * @date 2021/10/25
 */

@Configuration
public class DubboConfig {

    @DubboReference(version = "1.0.0", check = false)
    private TestProviderService testProviderService;

    @Bean
    public TestProviderService testProviderService() {
        return testProviderService;
    }

}
