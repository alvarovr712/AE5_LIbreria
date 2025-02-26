package com.example.AE5.Libreria.controller;


import com.example.AE5.Libreria.model.Libreria;
import com.example.AE5.Libreria.services.LibreriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("librerias")
public class LibreriaController {

    @Autowired
    private LibreriaService libreriaService;

    @PostMapping("add")
    public ResponseEntity<Libreria> addLibreria(@RequestBody Libreria libreria){
        return new ResponseEntity<>(libreriaService.AgregarLibreria(libreria), HttpStatus.OK);
    }
}
