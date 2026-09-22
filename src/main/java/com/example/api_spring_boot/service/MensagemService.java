package com.example.api_spring_boot.service;

import com.example.api_spring_boot.repository.MensagemRepository;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {
    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem(){
        return mensagemRepository.obteMensagem();
    }
}
