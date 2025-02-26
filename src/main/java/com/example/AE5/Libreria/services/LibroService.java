package com.example.AE5.Libreria.services;

import com.example.AE5.Libreria.model.Libro;

import java.util.List;

public interface LibroService {

    public Libro agregarLibro(Libro libro);

    public List<Libro> getAllLibros();

    public Libro getLibro(String nombre);
}
