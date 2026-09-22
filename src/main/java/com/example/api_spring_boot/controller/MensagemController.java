package com.example.api_spring_boot.controller;


import com.example.api_spring_boot.service.MensagemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MensagemController {
    private final MensagemService mensageService;

    public MensagemController(MensagemService mensageService) {
        this.mensageService = mensageService;
    }

    @GetMapping("/mensagem")
    public String mensagem() {
        return mensageService.obterMensagem();
    }
}
