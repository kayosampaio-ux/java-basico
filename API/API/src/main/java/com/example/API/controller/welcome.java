package com.example.API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class welcome {
        @GetMapping("/")
        public String bemvindo() {
            return "bem-vindo!";

        }

        @GetMapping("/dev")
        public String bemVindos() {
            return "Feito por: Kayo!!";

        }
    }

