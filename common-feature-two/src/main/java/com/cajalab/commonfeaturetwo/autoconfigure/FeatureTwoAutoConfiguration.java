package com.cajalab.commonfeaturetwo.autoconfigure;


import com.cajalab.commonfeaturetwo.service.FeatureTwoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@Slf4j
@AllArgsConstructor
@EnableConfigurationProperties(FeatureTwoProperties.class)
public class FeatureTwoAutoConfiguration {

    private final FeatureTwoProperties featureTwoProperties;

    @PostConstruct
    public void setup() {
        log.info("FeatureTwoAutoConfiguration.config.value=" + featureTwoProperties.getValue());
    }

    @Bean
    public FeatureTwoService featureTwoService() {
        return new FeatureTwoService();
    }

}
