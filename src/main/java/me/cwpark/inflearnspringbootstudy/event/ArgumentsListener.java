package me.cwpark.inflearnspringbootstudy.event;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentsListener {
    public ArgumentsListener(ApplicationArguments arguments) {
//        System.out.println("foo " + arguments.containsOption("foo"));
//        System.out.println("bar " + arguments.containsOption("bar"));

    }
}
