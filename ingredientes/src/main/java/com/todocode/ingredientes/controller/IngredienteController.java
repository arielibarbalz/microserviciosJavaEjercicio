package com.todocode.ingredientes.controller;

import com.todocode.ingredientes.service.IngredientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController{
    @Autowired
    private IngredientesService ingredienteServ;
    //Crear nuevo ingrediente
    @PostMapping("/crear")
    public String crearIngrediente(@RequestBody String ingrediente){
        return "crear-ingrediente";
    }
}
