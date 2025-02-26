package com.example.AE5.Libreria.services;

import com.example.AE5.Libreria.model.Libreria;


import java.util.List;

public interface LibreriaService {

    public Libreria AgregarLibreria(Libreria libreria);
    public List<Libreria> getAll();

    Libreria getLibreria(String nombre);


}
