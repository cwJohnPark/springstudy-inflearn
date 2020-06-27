package me.cwpark.inflearnspringbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class InflearnSpringbootStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(InflearnSpringbootStudyApplication.class);

        // 웹 서버 없이 기동
//        SpringApplication app =  new SpringApplication(InflearnSpringbootStudyApplication.class);
//        app.setWebApplicationType(WebApplicationType.NONE);
//        app.run(args);
    }

}
