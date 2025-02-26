package com.example.AE5.Libreria.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Entity
@Table(name = "editoriales")
public class Editorial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column
    private String dirección;


    @OneToMany(mappedBy = "editorial")
    private List<Libro> libros = new ArrayList<>();

    public Editorial(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;

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

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public Editorial(int id, String nombre, String dirección) {
        this.id = id;
        this.nombre = nombre;
        this.dirección = dirección;
    }

    public Editorial() {
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}
