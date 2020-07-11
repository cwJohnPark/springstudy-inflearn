package me.cwpark.inflearnspringbootstudy.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateEngineController {

    @GetMapping("/template")
    public String getTemplate(Model model) {
        model.addAttribute("name", "cwpark");
        return "/thymeleaf-demo";
    }
}
