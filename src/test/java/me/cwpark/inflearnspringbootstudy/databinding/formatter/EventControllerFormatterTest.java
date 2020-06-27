package me.cwpark.inflearnspringbootstudy.databinding.formatter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({EventControllerFormatter.class, EventFormatter.class})
public class EventControllerFormatterTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void eventFormatterTest() throws Exception {
        mockMvc.perform(get("/formatter/event/2"))
                .andExpect(status().isOk())
                .andExpect(content().string("2"));
    }
}