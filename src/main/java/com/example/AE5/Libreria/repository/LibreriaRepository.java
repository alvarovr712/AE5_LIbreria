package com.example.AE5.Libreria.repository;

import com.example.AE5.Libreria.model.Libreria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibreriaRepository extends JpaRepository<Libreria, Integer> {

    Libreria findByNombre(String nombre);
}
