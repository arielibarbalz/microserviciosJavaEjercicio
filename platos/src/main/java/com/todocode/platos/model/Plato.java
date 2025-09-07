package com.todocode.platos.model;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero_plato;
    private String nombre;
    private Double precio;
    private String descripcion;
    @ElementCollection(fetch = FetchType.EAGER )
    private List<String> listaIngredientes;
}

