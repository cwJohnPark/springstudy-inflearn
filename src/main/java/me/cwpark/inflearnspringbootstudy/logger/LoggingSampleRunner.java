package me.cwpark.inflearnspringbootstudy.logger;

import me.cwpark.inflearnspringbootstudy.property.Park;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LoggingSampleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(LoggingSampleRunner.class);

    @Autowired
    private Park park;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //printOut();
    }

    private void printOut() {
        logger.debug("======================");
        logger.debug("Logging Sample Runner");
        logger.debug("park name" + park.getName());
        logger.debug("======================");
    }
}
