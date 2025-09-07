package com.todocode.ingredientes.service;

import com.todocode.ingredientes.model.Ingrediente;

import java.util.List;

public interface IngredientesService{
    public List<Ingrediente> getIngredientes();
    public void saveIngredientes(Ingrediente ingrediente);
    public void deleteIngredientes(Long id);
    public Ingrediente findIngredientes(Long id);
    public void editIngredientes(Long id, Ingrediente ingrediente);
}
