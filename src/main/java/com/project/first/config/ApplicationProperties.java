package com.project.first.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "water.management")
@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class ApplicationProperties {
    String baseUrl;
    String context;
    String view;
    String create;
}
