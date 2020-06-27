package me.cwpark.inflearnspringbootstudy.databinding.formatter;

import me.cwpark.inflearnspringbootstudy.databinding.propertyeditor.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventControllerFormatter {

    @GetMapping("/formatter/event/{event}")
    public String getEvent(@PathVariable Event event) {
        System.out.println("#######" + this.getClass() + " event :" + event);
        return event.getId().toString();
    }

}
