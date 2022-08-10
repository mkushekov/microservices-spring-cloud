package kz.example.finance.configuration;

import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomFeignClientConfiguration extends FeignClientProperties.FeignClientConfiguration {
}