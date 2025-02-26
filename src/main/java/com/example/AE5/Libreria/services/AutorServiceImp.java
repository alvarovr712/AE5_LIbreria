package com.example.AE5.Libreria.services;

import com.example.AE5.Libreria.model.Autor;
import com.example.AE5.Libreria.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImp implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Autor agregarAutor(Autor autor) {


            return autorRepository.save(autor);


    }
}
