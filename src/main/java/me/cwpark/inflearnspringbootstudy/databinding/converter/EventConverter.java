package me.cwpark.inflearnspringbootstudy.databinding.converter;

import me.cwpark.inflearnspringbootstudy.databinding.propertyeditor.Event;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class EventConverter {

    // String -> Event
    @Component
    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String s) {
            System.out.println("#######Converter##########" +this.getClass() + "######################");
            return new Event(Integer.parseInt(s));
        }
    }

    // Event -> String
    @Component
    public static class EventToStringConverter implements Converter<Event, String> {
        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }
}
