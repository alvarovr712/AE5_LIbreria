package com.example.AE5.Libreria.services;

import com.example.AE5.Libreria.model.Editorial;

import java.util.List;

public interface EditorialService {

    public Editorial agregarEditorial(Editorial editorial);

    public List<Editorial> getAllEditoriales();

    public Editorial getEditorial(String nombre);
}
