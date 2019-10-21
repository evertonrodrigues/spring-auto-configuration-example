package com.cajalab.commonstarter.autoconfigure.feature.two;


import com.cajalab.commonfeaturetwo.FeatureTwoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConditionalOnClass(FeatureTwoService.class)
@Slf4j
public class FeatureTwoAutoConfiguration {

    @Value("${common.feature.two.config.value:default}")
    public String value;

    @PostConstruct
    public void setup() {
        log.info("FeatureTwoAutoConfiguration.config.value=" + value);
    }

    @Bean
    public FeatureTwoService featureTwoService() {
        return new FeatureTwoService();
    }

}
