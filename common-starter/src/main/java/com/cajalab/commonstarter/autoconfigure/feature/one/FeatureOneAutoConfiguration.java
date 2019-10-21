package com.cajalab.commonstarter.autoconfigure.feature.one;


import com.cajalab.commonfeatureone.FeatureOneService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConditionalOnClass(FeatureOneService.class)
@Slf4j
@AllArgsConstructor
@EnableConfigurationProperties(FeatureOneProperties.class)
public class FeatureOneAutoConfiguration {

    private final FeatureOneProperties featureOneProperties;

    @PostConstruct
    public void setup() {
        log.info("FeatureOneAutoConfiguration.config.value=" + featureOneProperties.getValue());
    }

    @Bean
    public FeatureOneService featureOneService() {
        return new FeatureOneService();
    }

}
