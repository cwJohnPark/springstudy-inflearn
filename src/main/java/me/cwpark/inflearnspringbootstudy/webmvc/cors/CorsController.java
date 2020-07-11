package me.cwpark.inflearnspringbootstudy.webmvc.cors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

    //@CrossOrigin(origins="http://localhost:18080") // WebConfigurer의 addCorsMappings 구현으로 대체
    @GetMapping("/mvc/cors")
    public String getCors() {
        return "cors success!";
    }
}
