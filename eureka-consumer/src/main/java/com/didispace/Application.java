package com.didispace;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
* 创建应用主类。
* 初始化RestTemplate,
* 用来真正发起REST请求。
* @EnableDiscoveryClient 注解用来将当前应用加入到服务治理体系中。
* */
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(true).run(args);
    }

}

