package com.leemuzi.config;


import com.leemuzi.properties.SmsProperties;
import com.leemuzi.service.SmsTemplate;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan("com.leemuzi.service")
@AutoConfiguration
@ConditionalOnClass(SmsTemplate.class)
@EnableConfigurationProperties(value = SmsProperties.class)
public class SmsAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public SmsTemplate smsTemplate(){
        return new SmsTemplate();
    }

}

