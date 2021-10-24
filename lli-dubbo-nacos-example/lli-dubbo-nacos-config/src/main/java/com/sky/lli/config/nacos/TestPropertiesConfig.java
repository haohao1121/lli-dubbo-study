package com.sky.lli.config.nacos;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 描述:
 *
 * @author lihao
 * @date 2021/10/23
 */
@Data
@Configuration
@NacosConfigurationProperties(dataId = "testPropertiesConfig", type = ConfigType.PROPERTIES, autoRefreshed = true)
public class TestPropertiesConfig {
    private String addr;
    private String mobile;
    private Integer floor;
    private List<String> cars;
}
