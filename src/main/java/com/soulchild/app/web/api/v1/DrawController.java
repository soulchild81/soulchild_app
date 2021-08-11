package com.soulchild.app.web.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrawController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello";
    }

}
