package com.example.AE5.Libreria.repository;

import com.example.AE5.Libreria.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LibroRepository extends JpaRepository<Libro,Integer> {

    Libro getByTitulo(String titulo);

    @Query("FROM Libro l WHERE l.titulo = :titulo")
    Libro findByTitulo(String titulo);
}
