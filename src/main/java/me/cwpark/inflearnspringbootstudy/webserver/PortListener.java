package me.cwpark.inflearnspringbootstudy.webserver;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// web server가 초기화되면 호출할 콜백 정의
@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {

    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent event) {
        printPort(event);
    }

    private void printPort(ServletWebServerInitializedEvent event) {
        ServletWebServerApplicationContext applicationContext = event.getApplicationContext();
        int port = applicationContext.getWebServer().getPort();
        //System.out.println(port);
    }
}
