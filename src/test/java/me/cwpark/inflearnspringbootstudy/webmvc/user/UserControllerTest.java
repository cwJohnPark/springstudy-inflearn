package me.cwpark.inflearnspringbootstudy.webmvc.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class) // web 계층 관련 Bean만 주입
public class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));
    }
    
    @Test
    public void createUser_JSON() throws Exception {
        String userJson = "{\"username\":\"cwpark\", \"password\":\"123\"}";
        mockMvc.perform(post("/users/create")
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .content(userJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username", is(equalTo("cwpark"))))
                .andExpect(jsonPath("$.password", is(equalTo("123"))));
    }
    @Test
    public void createUser_XML() throws Exception {
        String userJson = "{\"username\":\"cwpark\", \"password\":\"123\"}";
        mockMvc.perform(post("/users/create")
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_ATOM_XML)
                    .content(userJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(xpath("/User/username").string("cwpark"))
                .andExpect(xpath("/User/password").string("123"));
    }
}
