package me.cwpark.inflearnspringbootstudy.webmvc.hateos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HateosController {


    @GetMapping("/mvc/hateos")
    public EntityModel<Hello> getHello() {
        Hello hello = new Hello();
        hello.setPrefix("John");
        hello.setName("cwpark");

        EntityModel<Hello> helloEntityModel = EntityModel.of(hello);
        helloEntityModel.add(linkTo(methodOn(HateosController.class).getHello()).withSelfRel());

        return helloEntityModel;
    }
}
