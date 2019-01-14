package com.light;

import com.light.encodings.EncodingConvertor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        System.out.println("测试内容：");
        System.out.println(System.getProperty("file.encoding"));
        Map<String, EncodingConvertor> map = context.getBeansOfType(EncodingConvertor.class);
        System.out.println("测试内容：");
        System.out.println(map);
    }
}

