package com.example.AE5.Libreria.controller;


import com.example.AE5.Libreria.model.Autor;
import com.example.AE5.Libreria.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("autores")
public class AutorController {

    @Autowired private AutorService autorService;

    @GetMapping("error")
    public String getError(){

        return "Error en la app";
    }

    @PostMapping("add")
    public String addAutor(){
        autorService.agregarAutor(new Autor("Alvaro","Vaquero"));
        return "Liga agregada correctamente";
    }
}
