package com.didispace;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
* 通过 @EnableEurekaServer 注解启动一个服务注册中心提供给其它应用进行对话。
* 这一步非常简单，只需要在一个普通的Spring Boot应用中添加这个注解就能开启次功能
* */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(true).run(args);
    }
}
