package me.cwpark.inflearnspringbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 같은 패키지 위치에서 부터 ComponentScan 시작
//@EnableConfigurationProperties(Park.class) // 자동으로 애노테이션이 등록되어 있음
public class InflearnSpringbootStudyApplication {

    public static void main(String[] args)  {
        SpringApplication.run(InflearnSpringbootStudyApplication.class, args);


//        SpringApplication app = new SpringApplication(InflearnSpringbootStudyApplication.class);
//        app.addListeners(new SampleListener()); // startingListener는 등록이 필요
//        app.run(args);

        // 웹 서버 없이 기동
//        SpringApplication app =  new SpringApplication(InflearnSpringbootStudyApplication.class);
//        app.setWebApplicationType(WebApplicationType.NONE);
//        app.run(args);
    }


}
