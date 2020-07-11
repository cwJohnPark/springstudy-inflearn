package me.cwpark.inflearnspringbootstudy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
// servlet 컨테이너를 띄우지 않고, Mock 서블릿 객체를 사용
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK) // 내장 톰캣 사용 안함
@AutoConfigureMockMvc
public class TestRestControllerTestWithoutTomcat {

    String expectedContent = "hello, Park";
    String requestUrl = "/holoman";

    @Autowired(required = false)
    MockMvc mockMvc;

    /**
     * WebEnvironment.MOCK 사용 시
     */
    @Test
    public void helloTest() throws Exception {
        mockMvc.perform(get(requestUrl))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedContent))
                .andDo(print());
    }

    
}