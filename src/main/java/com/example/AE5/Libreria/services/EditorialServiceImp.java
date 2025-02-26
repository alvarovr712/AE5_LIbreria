package com.example.AE5.Libreria.services;


import com.example.AE5.Libreria.model.Editorial;
import com.example.AE5.Libreria.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialServiceImp implements EditorialService{

    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public Editorial agregarEditorial(Editorial editorial) {
        if(editorialRepository.findByNombre(editorial.getNombre()) == null){
            return editorialRepository.save(editorial);
        }else {
            return null;
        }
    }

    @Override
    public List<Editorial> getAllEditoriales() {
        return editorialRepository.findAll();
    }

    @Override
    public Editorial getEditorial(String nombre) {
        return editorialRepository.findByNombre(nombre);
    }


}
