package com.todocode.platos.service;

import com.todocode.platos.repository.IPlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatoService implements IPlatoService{
    @Autowired
    private IPlatoRepository platosRepo;
}
