package me.cwpark.inflearnspringbootstudy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
//@TestPropertySource(properties = "my.age=11")
@TestPropertySource(locations = "classpath:/test.properties")
public class InflearnSpringbootStudyApplicationTests {

    @Autowired
    Environment environment;

    @Test
    public void test() {
        assertThat(environment.getProperty("my.name")).isEqualTo("ppark");
    }

    @Test
    public void fileRootPathApplicationProperties() {
        assertThat(environment.getProperty("my.value"))
                .isEqualTo("1");
        assertThat(environment.getProperty("my.value2"))
                .isEqualTo("2");
    }

    @Test
    public void classPathApplicationProperties() throws Exception {
        assertThat(environment.getProperty("my.age"))
                .isNotNull();
    }

}
