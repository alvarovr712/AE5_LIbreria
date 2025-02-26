package com.example.AE5.Libreria.repository;

import com.example.AE5.Libreria.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

    Autor findByNombre(String nombre);

}
