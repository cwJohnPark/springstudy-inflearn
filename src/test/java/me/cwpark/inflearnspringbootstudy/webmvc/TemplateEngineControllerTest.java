package me.cwpark.inflearnspringbootstudy.webmvc;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(TemplateEngineController.class)
public class TemplateEngineControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    WebClient webClient;

    /**
     * 요청 "/"
     * 응답
     *  - 모델 name: cwpark
     *  - 뷰 이름: thymeleaf-demo
     * @throws Exception
     */
    @Test
    public void testTemplate() throws Exception {
        // given
        mockMvc.perform(get("/template"))
                .andExpect(status().isOk())
                .andExpect(view().name("/thymeleaf-demo"))
                .andExpect(model().attribute("name", "cwpark"))
                .andExpect(content().string(containsString("cwpark")));
                //.andExpect(xpath("//h1").string("cwpark"));
        // when
        // then
    }
    
    @Test
    public void testWebClient() throws Exception {
        // given
        // when
        HtmlPage page = webClient.getPage("/template");
        HtmlHeading1 h1 = page.getFirstByXPath("//h1");
        // then
        assertThat(h1.getTextContent()).isEqualTo("cwpark");
    }
}