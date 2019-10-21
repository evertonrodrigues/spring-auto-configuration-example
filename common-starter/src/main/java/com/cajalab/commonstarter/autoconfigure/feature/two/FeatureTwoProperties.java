package com.cajalab.commonstarter.autoconfigure.feature.two;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "common.feature.two.config")
@Getter
@Setter
public class FeatureTwoProperties {

    public String value;

}
