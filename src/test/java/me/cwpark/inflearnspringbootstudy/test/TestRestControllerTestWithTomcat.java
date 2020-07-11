package me.cwpark.inflearnspringbootstudy.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // 내장 톰캣 사용 함!
@AutoConfigureMockMvc
public class TestRestControllerTestWithTomcat {

    String expectedContent = "hello, Park";
    String requestUrl = "/holoman";

    /**
     * WebEnvironment.RANDOM_PORT 사용
     */
    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void helloTestWithEmbeddedTomcat() throws Exception {
        String result = testRestTemplate.getForObject(requestUrl, String.class);
        assertThat(result).isEqualTo(expectedContent);
    }
}
