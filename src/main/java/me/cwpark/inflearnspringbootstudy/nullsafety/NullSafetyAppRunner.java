package me.cwpark.inflearnspringbootstudy.nullsafety;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class NullSafetyAppRunner implements ApplicationRunner {

    @Autowired
    NullSafetyEventService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String message = service.createEvent(null);
        service.createNullEvent("kee");
    }
}
