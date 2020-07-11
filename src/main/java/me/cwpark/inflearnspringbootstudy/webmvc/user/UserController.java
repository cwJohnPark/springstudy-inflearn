package me.cwpark.inflearnspringbootstudy.webmvc.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @PostMapping("/users/create")
    // RestController는 @ResponseBody 생략할 수 있음
    public User create(@RequestBody User user) {
        return user;
    }

}
