package me.cwpark.inflearnspringbootstudy.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class ConfigurationSampleRunner implements ApplicationRunner {

    @Autowired
    Park park;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //printOutProperty();
    }

    private void printOutProperty() {
        System.out.println(park.getFullName());
        System.out.println(park.getAge());
        System.out.println(park.getName());
        System.out.println(park.getSessionTimeOut());
        System.out.println(park.getEmpty());
    }
}
