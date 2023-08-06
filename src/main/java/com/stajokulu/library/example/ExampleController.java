package com.stajokulu.library.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ExampleController {
    @GetMapping
    public String getMessage(){
        return "Hello StajOkulu Spring Boot Project";
    }

    @GetMapping("/borc")
    public String getSecondMessage(){
        return "Borcunuz 50 TL";
    }

    @PostMapping
    public String postistegi(){
        return "Bu bir post isteği";
    }

    @GetMapping("/{name}")
    public String getMessage(@PathVariable String name){
        return "Hello" + name;
    }


}
