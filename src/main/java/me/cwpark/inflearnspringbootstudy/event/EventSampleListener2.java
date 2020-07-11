package me.cwpark.inflearnspringbootstudy.event;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventSampleListener2 implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        //printOut(event);
    }

    private void printOut(ApplicationStartedEvent event) {
        System.out.println("Applcation is started / " + event.getSource());
    }

}
