package com.example.AE5.Libreria.controller;


import com.example.AE5.Libreria.model.Libreria;
import com.example.AE5.Libreria.model.Libro;
import com.example.AE5.Libreria.services.LibreriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("librerias")
public class LibreriaController {

    @Autowired
    private LibreriaService libreriaService;

    @PostMapping("add")
    public ResponseEntity<Libreria> addLibreria(@RequestBody Libreria libreria) {
        return new ResponseEntity<>(libreriaService.AgregarLibreria(libreria), HttpStatus.OK);
    }

    @GetMapping("getAll")
    ResponseEntity<List<Libreria>> getAll() {
        return new ResponseEntity<>(libreriaService.getAll(), HttpStatus.OK);
    }

  
    @GetMapping("getByName")
    public ResponseEntity<Libreria> getLibreria(@RequestParam String nombre) {
        return new ResponseEntity<>(libreriaService.getLibreria(nombre), HttpStatus.OK);
    }
}
