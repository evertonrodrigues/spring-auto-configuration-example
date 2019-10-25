package com.cajalab.commonfeaturetwo.service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class FeatureTwoService {

    @Getter
    @Value("${common.feature.two.service.value:default}")
    private String value;

    @PostConstruct
    public void setup() {
        log.info("FeatureTwoService.value=" + value);
    }

}
