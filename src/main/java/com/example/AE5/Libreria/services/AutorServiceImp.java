package com.example.AE5.Libreria.services;

import com.example.AE5.Libreria.model.Autor;
import com.example.AE5.Libreria.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImp implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Autor agregarAutor(Autor autor) {

    if(autorRepository.findByNombre(autor.getNombre()) == null){
        return autorRepository.save(autor);
    }else {
        return null;
    }





    }

    @Override
    public List<Autor> getAllAutores() {
        return autorRepository.findAll();
    }

    @Override
    public Autor getAutor(String nombre) {
        return  autorRepository.findByNombre(nombre);
    }
}
