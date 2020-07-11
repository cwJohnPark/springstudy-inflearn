package me.cwpark.inflearnspringbootstudy.event;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class EventSampleListener implements ApplicationListener<ApplicationStartingEvent> {

    private void printOut(ApplicationStartingEvent event) {
        //System.out.println("Applcation is starting " + event.getSource());
    }

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        // printOut(event);
    }
}
