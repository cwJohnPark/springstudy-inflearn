package me.cwpark.inflearnspringbootstudy.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * OutputCaptureRule 테스트 유틸 사용
 */
@RunWith(SpringRunner.class)
@WebMvcTest(TestRestController.class)
public class TestRestControllerTestOutputCapture {

    /**
     * 로그, 콘솔에 찍히는 모든걸 캡쳐
     */
    @Rule
    public OutputCaptureRule outputCaptureRule = new OutputCaptureRule();

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

        assertThat(outputCaptureRule.toString())
                .contains("holoman");

    }
}
