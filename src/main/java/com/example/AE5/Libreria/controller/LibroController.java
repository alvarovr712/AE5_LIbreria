package com.example.AE5.Libreria.controller;


import com.example.AE5.Libreria.model.Editorial;
import com.example.AE5.Libreria.model.Libro;
import com.example.AE5.Libreria.services.AutorService;
import com.example.AE5.Libreria.services.EditorialService;
import com.example.AE5.Libreria.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("error")
    public String getError(){

        return "Error en la app";
    }

    @PostMapping("add")

    public ResponseEntity<Libro> addLibro(@RequestBody Libro libro){

        return new ResponseEntity<>(libroService.agregarLibro(libro), HttpStatus.OK);
    }

    @GetMapping("getAll")

    public ResponseEntity<List<Libro>> getLibros(){
        return new ResponseEntity<>(libroService.getAllLibros(),HttpStatus.OK);
    }

    @GetMapping("getByTitulo")
    public ResponseEntity<Libro> getLibro(@RequestParam String titulo){
        return new ResponseEntity<>(libroService.getLibro(titulo),HttpStatus.OK);
    }
}
