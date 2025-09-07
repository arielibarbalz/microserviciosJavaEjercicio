package com.todocode.platos.controller;

import com.todocode.platos.service.IPlatoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platos")
public class PlatoController {
    private IPlatoService platoServ;

    public String crearplatos(@RequestBody String plato){
        return "crear-platos";
    }

}
