package com.example.demoSpringBootRuben;

import org.springframework.web.bind.annotation.*;

@RestController()
public class Controlador1 {

    @GetMapping("/user/{nombre}")
    public String getNombre(@PathVariable String nombre){
        return "Hola " + nombre;
    }

    @PostMapping("/useradd")
    Persona usserAdd(@RequestBody Persona persona){
        persona.setEdad(String.valueOf(Integer.parseInt(persona.getEdad()) + 1));
        return persona;
    }

}
