package com.example.AE5.Libreria.services;

import com.example.AE5.Libreria.model.Autor;

import java.util.List;

public interface AutorService {

    public Autor agregarAutor(Autor autor);
    public List<Autor> getAllAutores();
    public Autor getAutor(String nombre);
}
