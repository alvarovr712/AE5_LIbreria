package com.example.AE5.Libreria.controller;

import com.example.AE5.Libreria.model.Editorial;
import com.example.AE5.Libreria.services.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("editoriales")
public class EditorialController {

    @Autowired private EditorialService editorialService;


    @GetMapping("error")
    public String getError(){

        return "Error en la app";
    }

    @PostMapping("add")
    public ResponseEntity<Editorial> addEditorial(@RequestBody Editorial editorial){
        return new ResponseEntity<>(editorialService.agregarEditorial(editorial), HttpStatus.OK);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Editorial>> getEditoriales(){

        return new ResponseEntity<>(editorialService.getAllEditoriales(),HttpStatus.OK);

    }

    @GetMapping("getByName")
    public ResponseEntity<Editorial> getEditorialByName(@RequestParam String nombre){
        return new ResponseEntity<>(editorialService.getEditorial(nombre),HttpStatus.OK);
    }
}
