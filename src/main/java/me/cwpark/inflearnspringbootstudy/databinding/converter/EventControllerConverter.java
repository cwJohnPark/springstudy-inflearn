package me.cwpark.inflearnspringbootstudy.databinding.converter;

import me.cwpark.inflearnspringbootstudy.databinding.propertyeditor.Event;
import me.cwpark.inflearnspringbootstudy.databinding.propertyeditor.EventEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventControllerConverter {

    @GetMapping("/converter/event/{event}")
    public String getEvent(@PathVariable Event event) {
        System.out.println(event);
        return event.getId().toString();
    }

}
