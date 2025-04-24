package com.proyecto.fullstack1.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productoBenjaController {

    @GetMapping("/saludo")
    public String Saludo() {
        return "Hola como estas";
    }

    @GetMapping("/usuario/{id}")
    public String getUsuario(@PathVariable Long id) {
        return "Hola usuario: " + id;
    }
}