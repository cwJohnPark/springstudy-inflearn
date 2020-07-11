package me.cwpark.inflearnspringbootstudy.test;

import me.cwpark.inflearnspringbootstudy.property.Park;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Slice Test
 * 레이어 별로 잘라서 테스트하고 싶을 때
 */
@RunWith(SpringRunner.class)
@WebMvcTest(TestRestController.class) // 컨트롤러 하나만 테스트하므로 빠름
public class TestRestControllerTestSlice {

    /**
     * Service 계층은 빈 등록이 안되므로 목 객체 주입
     * @see 43.3.9 Auto-configured Spring MVC Tests
     */
    @MockBean
    TestSampleService mockService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void helloTestWithEmbeddedTomcat() throws Exception {
        when(mockService.getName()).thenReturn("Park");

        mockMvc.perform(get("/holoman"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello, Park"));
    }
}
