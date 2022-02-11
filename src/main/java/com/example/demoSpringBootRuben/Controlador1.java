package com.example.demoSpringBootRuben;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController()
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    @GetMapping("/user/{nombre}")
    public String getNombre(@PathVariable String nombre){
        personaService.setNombre(nombre);
        return "Hola " + nombre;
    }

    @PostMapping("/useradd")
    Persona usserAdd(@RequestBody Persona persona){
        persona.setEdad(String.valueOf(Integer.parseInt(persona.getEdad()) + 1));
        return persona;
    }

    @GetMapping("/controlador1/addpersona")
    public String getPersona(@RequestHeader Map<String,String> headers){
        headers.forEach((key, value) -> {
            personaService.set(key, value);
        });
        return personaService.toString();
    }

    @GetMapping("/controlador1/addpersona2")
    public String getPersona2(@RequestHeader String nombre, @RequestHeader String ciudad, @RequestHeader String edad){
        personaService.setNombre(nombre);
        personaService.setEdad(edad);
        personaService.setEdad(edad);
        return personaService.toString();
    }
}
