package com.sky.lli.config.nacos;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:
 *
 * @author lihao
 * @date 2021/10/23
 */
@Data
@Configuration
@NacosConfigurationProperties(dataId = "testJsonConfig", type = ConfigType.JSON, autoRefreshed = true)
public class TestJsonConfig {
    private String nacosName;
    private Integer nacosAge;
    private Boolean marry;
}
