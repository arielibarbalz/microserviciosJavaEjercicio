package com.todocode.platos.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Plato {
    @Id
    private Long numero_plato;
    private String nombre;
    private Double precio;
    private String descripcion;
    @ElementCollection
    private List<String> ingredientes;

}

