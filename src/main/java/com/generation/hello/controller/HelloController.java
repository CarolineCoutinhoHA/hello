package com.generation.hello.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping ("/hello")
    public String helloWorld() {
        return "Hello World!!";
    }

    @GetMapping ("/bsm")
    public List<String> getBsmList() {
        return Arrays.asList(
                "Comunicação",
                "Orientação ao Futuro",
                "Orientação ao Detalhe",
                "Trabalho em Equipe",
                "Persistência",
                "Mentalidade de Crescimento",
                "Organização",
                "Responsabilidade Pessoal",
                "Proatividade"
        );
    }

        @GetMapping ("/objetivos")
        public List<String> getObjetivos() {
            return Arrays.asList (
                    "Aprender o conteúdo do curso",
                    "Entender bem Java",
                    "Me formar na Generation",
                    "Conseguir um estágio na área",
                    "Formar-me na faculdade de Sistema de Iformação",
                    "Conseguir um emprego na área"
            );
    }
}
