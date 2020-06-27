package me.cwpark.inflearnspringbootstudy.databinding.propertyeditor;

import me.cwpark.inflearnspringbootstudy.databinding.formatter.EventFormatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest // Web과 관련된 bean만 등록하여 테스트됨
public class EventControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getTest() throws Exception {
        mockMvc.perform(get("/event/1"))                   // get 방식으로 /event/1 의 주소로 요청 시
                .andExpect(status().isOk())                           // 응답은 200
                .andExpect(content().string("1"));     // 결과는 문자열 1이 나와야 한다.

    }
}