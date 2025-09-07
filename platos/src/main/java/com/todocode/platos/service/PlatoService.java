package com.todocode.platos.service;

import com.todocode.platos.model.Plato;
import com.todocode.platos.repository.IPlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoService implements IPlatoService{
    @Autowired
    private IPlatoRepository platosRepo;

    @Override
    public List<Plato> getPlatos() {
        return List.of();
    }

    @Override
    public void savePlato(Plato plato) {

    }

    @Override
    public void deletePlato(Long id) {

    }

    @Override
    public Plato findPlato(String nombre) {
        return null;
    }

    @Override
    public void editPlato(Long id, Plato plato) {

    }
}
