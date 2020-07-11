package me.cwpark.inflearnspringbootstudy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.mockito.Mockito.when;

/**
 * 비동기 웹 client를 사용하여 테스트한다.
 * webFlux 의존성을 추가해야 한다.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestRestControllerTestAsync {

    // 사용이 용이하여 추천하는 clinet API이다.
    @Autowired
    WebTestClient client;

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

        client.get().uri("/holoman").exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("hello, Park");

    }
}
