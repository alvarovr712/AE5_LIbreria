package com.example.AE5.Libreria.services;

import com.example.AE5.Libreria.model.Autor;
import com.example.AE5.Libreria.model.Editorial;
import com.example.AE5.Libreria.model.Libro;
import com.example.AE5.Libreria.repository.AutorRepository;
import com.example.AE5.Libreria.repository.EditorialRepository;
import com.example.AE5.Libreria.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImp implements LibroService{

    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private EditorialRepository editorialRepository;
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Libro agregarLibro(Libro libro) {
        if(libroRepository.getByTitulo(libro.getTitulo()) == null){


            Autor autor = autorRepository.findById(libro.getAutor().getId()).orElse(null);
            Editorial editorial = editorialRepository.findById(libro.getEditorial().getId()).orElse(null);

            if (autor != null && editorial != null) {
                libro.setAutor(autor);
                libro.setEditorial(editorial);

                return libroRepository.save(libro);
            } else {

                return null;}
        }else {
            return null;
        }
    }

    @Override
    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }



    @Override
    public Libro getLibro(String titulo) {
        return libroRepository.findByTitulo(titulo);
    }
}
