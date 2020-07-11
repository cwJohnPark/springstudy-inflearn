package me.cwpark.inflearnspringbootstudy.profile;

import me.cwpark.inflearnspringbootstudy.property.Park;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileSampleRunner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    private Park park ;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //printOut();
    }

    private void printOut() {
        System.out.println("================");
        System.out.println("hello : " + hello);
        System.out.println("================");

        System.out.println("Park name : " + park.getName());
        System.out.println("Park full name : " + park.getFullName());
    }
}
