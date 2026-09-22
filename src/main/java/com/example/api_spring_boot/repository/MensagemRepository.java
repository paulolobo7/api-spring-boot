package com.example.api_spring_boot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {


    public String obteMensagem()  {
        return "Hello World, isso é uma rota";
    }
}
