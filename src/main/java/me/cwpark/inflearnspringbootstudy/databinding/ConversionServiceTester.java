package me.cwpark.inflearnspringbootstudy.databinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

// ConversionService Test
@Component
public class ConversionServiceTester implements ApplicationRunner {

    @Autowired(required = false)
    ConversionService conversionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // System.out.println(conversionService); // converter를 전부 볼 수 있음
        // System.out.println(conversionService.getClass().toString());

    }
}
