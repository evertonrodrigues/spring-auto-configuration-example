package com.cajalab.commonfeatureone;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class FeatureOneService {

    @Getter
    @Value("${common.feature.one.service.value:default}")
    private String value;

    @PostConstruct
    public void setup() {
        log.info("FeatureOneService.value=" + value);
    }

}
