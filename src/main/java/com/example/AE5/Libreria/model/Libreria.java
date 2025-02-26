package com.example.AE5.Libreria.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "librerias")
public class Libreria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String nombre_dueño;
    @Column
    private String dirección;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name="librerias_libros",
            joinColumns = @JoinColumn(name = "id_libreria"),
            inverseJoinColumns = @JoinColumn(name="id_libros"))

    private List<Libro> libros ;

    public Libreria(int id, String nombre, String nombre_dueño, String dirección, List<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.nombre_dueño = nombre_dueño;
        this.dirección = dirección;
        this.libros = libros;
    }

    public Libreria() {
    }

    public Libreria(String nombre, String nombre_dueño, String dirección, List<Libro> libros) {
        this.nombre = nombre;
        this.nombre_dueño = nombre_dueño;
        this.dirección = dirección;
        this.libros = libros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nombre_dueño='" + nombre_dueño + '\'' +
                ", dirección='" + dirección + '\'' +
                ", libros=" + libros +
                '}';
    }
}
