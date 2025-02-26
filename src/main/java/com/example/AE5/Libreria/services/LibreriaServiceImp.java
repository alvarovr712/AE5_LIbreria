package com.example.AE5.Libreria.services;

import com.example.AE5.Libreria.model.Libreria;
import com.example.AE5.Libreria.repository.LibreriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibreriaServiceImp implements LibreriaService{

    @Autowired
    private LibreriaRepository libreriaRepository;


    @Override
    public Libreria AgregarLibreria(Libreria libreria) {
        if(libreriaRepository.findByNombre(libreria.getNombre()) == null){

           return libreriaRepository.save(libreria);
        }else {
            return null;
        }
    }

    @Override
    public List<Libreria> getAll() {
        return libreriaRepository.findAll();
    }

    @Override
    public Libreria getLibreria(String nombre) {
        return libreriaRepository.findByName(nombre);
    }


}

