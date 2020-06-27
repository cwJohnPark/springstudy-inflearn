package me.cwpark.inflearnspringbootstudy.databinding.formatter;

import me.cwpark.inflearnspringbootstudy.databinding.propertyeditor.Event;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

// thread-safe하므로 빈으로 등록가능
@Component
public class EventFormatter implements Formatter<Event> {

    @Override
    public Event parse(String s, Locale locale) throws ParseException {
        System.out.println("#######Formatter##########" +this.getClass() + "######################");
        return new Event(Integer.parseInt(s));
    }

    @Override
    public String print(Event event, Locale locale) {
        return event.getId().toString();
    }
}
