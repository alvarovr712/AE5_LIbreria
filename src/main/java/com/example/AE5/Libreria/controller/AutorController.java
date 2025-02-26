package com.example.AE5.Libreria.controller;


import com.example.AE5.Libreria.model.Autor;
import com.example.AE5.Libreria.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("autores")
public class AutorController {

    @Autowired private AutorService autorService;

    @GetMapping("error")
    public String getError(){

        return "Error en la app";
    }

    @PostMapping("add")
    public String addAutor(@RequestBody Autor autor){
        autorService.agregarAutor(autor);
        return "Autor agregado correctamente" + " " + autor.toString();
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Autor>> getAutores(){
        return (new ResponseEntity<>(autorService.getAllAutores(), HttpStatus.OK));
    }

    @GetMapping("getByName")
    public  ResponseEntity<Autor> getAutorByName(@RequestParam String nombre){
        return (new ResponseEntity<>(autorService.getAutor(nombre),HttpStatus.OK));
    }
}
