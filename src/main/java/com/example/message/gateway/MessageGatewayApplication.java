package com.example.message.gateway;

import com.example.message.gateway.utils.SpringContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MessageGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageGatewayApplication.class, args);
    }

    @Bean
    public SpringContextUtil springContextUtil(){
        return new SpringContextUtil();
    }

}
