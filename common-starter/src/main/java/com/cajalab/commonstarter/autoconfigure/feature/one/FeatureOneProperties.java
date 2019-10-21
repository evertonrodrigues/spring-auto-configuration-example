package com.cajalab.commonstarter.autoconfigure.feature.one;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "common.feature.one.config")
@Getter
@Setter
public class FeatureOneProperties {

    public String value;

}
