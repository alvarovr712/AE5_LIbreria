package com.example.AE5.Libreria.repository;

import com.example.AE5.Libreria.model.Libreria;
import com.example.AE5.Libreria.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LibreriaRepository extends JpaRepository<Libreria, Integer> {

    Libreria findByNombre(String nombre);

    @Query("FROM Libreria l WHERE l.nombre = :nombre")
    Libreria findByName(String nombre);


}
