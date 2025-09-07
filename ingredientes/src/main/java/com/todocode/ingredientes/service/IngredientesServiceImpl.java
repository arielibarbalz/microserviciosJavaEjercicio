package com.todocode.ingredientes.service;

import com.todocode.ingredientes.model.Ingrediente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientesServiceImpl implements IngredientesService{
    @Override
    public List<Ingrediente> getIngredientes() {
        return List.of();
    }

    @Override
    public void saveIngredientes(Ingrediente ingrediente) {

    }

    @Override
    public void deleteIngredientes(Long id) {

    }

    @Override
    public Ingrediente findIngredientes(Long id) {
        return null;
    }

    @Override
    public void editIngredientes(Long id, Ingrediente ingrediente) {

    }
}
