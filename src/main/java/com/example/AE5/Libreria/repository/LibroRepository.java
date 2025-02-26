package com.example.AE5.Libreria.repository;

import com.example.AE5.Libreria.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro,Integer> {

    Libro getByTitulo(String titulo);

    @Query("FROM Libro l WHERE l.titulo = :titulo")
    Libro findByTitulo(String titulo);

     @Query ("SELECT l FROM Libro l JOIN l.librerias lib WHERE lib.id = :libreria_id")
    List<Libro> buscarLibrosenLibreria(int libreria_id);
}
