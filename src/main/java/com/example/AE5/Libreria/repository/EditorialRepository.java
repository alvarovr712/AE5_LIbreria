package com.example.AE5.Libreria.repository;

import com.example.AE5.Libreria.model.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorialRepository extends JpaRepository<Editorial,Integer> {

        Editorial findByNombre(String nombre);
}
