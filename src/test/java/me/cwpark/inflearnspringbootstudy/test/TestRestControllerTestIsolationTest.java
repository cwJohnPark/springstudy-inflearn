package me.cwpark.inflearnspringbootstudy.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestRestControllerTestIsolationTest {

    String expectedContent = "hello, Park";
    String requestUrl = "/holoman";

    @Autowired
    TestRestTemplate testRestTemplate;

    /**
     * Controller를 고립하기 위해
     * Service객체를 목 객체로 대체
     */
    @MockBean
    TestSampleService mockService;

    @Test
    public void helloTestWithEmbeddedTomcat() throws Exception {
        when(mockService.getName()).thenReturn("Park");

        String result = testRestTemplate.getForObject(requestUrl, String.class);
        assertThat(result).isEqualTo(expectedContent);

    }

}
