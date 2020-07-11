package me.cwpark.inflearnspringbootstudy.event;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EventSampleRunner implements ApplicationRunner {

    @Value("${my.value}")
    private String value;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("foo " + args.containsOption("foo"));
//        System.out.println("bar " + args.containsOption("bar"));
    }
}
