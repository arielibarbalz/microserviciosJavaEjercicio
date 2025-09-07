package com.todocode.platos.controller;

import com.todocode.platos.model.Plato;
import com.todocode.platos.service.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platos")
public class PlatoController {
    @Autowired
    private IPlatoService platoServ;
    @PostMapping
    public String crearplatos(@RequestBody String plato){
        return "crear-platos";
    }
    @GetMapping("/traer")
    public List<Plato> traerPlatos(){
        return platoServ.getPlatos();
    }
    @DeleteMapping("/borrar/{id}")
    public String deletePlato(@PathVariable Long numero_plato) {
        platoServ.deletePlato(numero_plato);
        return "Plato eliminado correctamente";
    }
    @GetMapping("traer/{nombre}")
    public Plato traerPlatoNombre(@PathVariable String nombre){
        return platoServ.findPlato(nombre);
    }
}
