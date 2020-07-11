package me.cwpark.inflearnspringbootstudy.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    Logger logger = LoggerFactory.getLogger(TestRestController.class);

    @Autowired
    private TestSampleService testSampleService;

    @GetMapping("/holoman")
    public String getHello() {
        logger.info("holoman");
        return "hello 1, " + testSampleService.getName();
    }
}
