package com.membership.subscriptionmembership.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer enumCustomizer() {
        return builder -> builder.featuresToEnable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    }
}
