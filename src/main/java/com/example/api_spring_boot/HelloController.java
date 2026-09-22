package com.example.api_spring_boot;


import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloController {

    //Atributos
    String Num = "10";
    int MeuInt = Integer.parseInt(Num);

    //Constructor
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String param) {
        System.out.println(MeuInt);
        return String.valueOf(MeuInt);
    }

}



