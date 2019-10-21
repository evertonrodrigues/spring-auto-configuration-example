package com.cajalab.commonstarter.autoconfigure.feature.one;


import com.cajalab.commonfeatureone.FeatureOneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConditionalOnClass(FeatureOneService.class)
@Slf4j
public class FeatureOneAutoConfiguration {

    @Value("${common.feature.one.config.value:default}")
    public String value;

    @PostConstruct
    public void setup() {
        log.info("FeatureOneAutoConfiguration.config.value=" + value);
    }

    @Bean
    public FeatureOneService featureOneService() {
        return new FeatureOneService();
    }

}
