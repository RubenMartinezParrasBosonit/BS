package com.example.demoSpringBootRuben;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController()
public class Controlador1 {

    @Autowired
    @Qualifier("PersonaServiceImp")
    PersonaService personaService;

    @Autowired
    @Qualifier("bean1")
    PersonaService personaService1;

    @Autowired
    @Qualifier("bean2")
    PersonaService personaService2;

    @Autowired
    @Qualifier("bean3")
    PersonaService personaService3;

    @Autowired
    ArrayList<CiudadService> ciudades;

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
        personaService.setCiudad(ciudad);
        return personaService.toString();
    }

    @PostMapping("/controlador1/addciudad")
    public String ciudadAdd(@RequestBody Ciudad ciudad){
        CiudadService c = new CiudadServiceImp();
        c.setNombre(ciudad.getNombre());
        c.setNumeroHabitantes(ciudad.getNumeroHabitantes());
        ciudades.add(c);
        return ciudad.toString() + " añadida";
    }

    @GetMapping("/controlador1/getciudad")
    public String getCiudades(){
        return ciudades.toString();
    }

    @GetMapping("/controlador1/bean/{bean}")
    public String getPersonaBean(@PathVariable String bean){
        switch(bean){
            case "bean1":
                return personaService1.toString();
            case "bean2":
                return personaService2.toString();
            case "bean3":
                return personaService3.toString();
            default:
                return "Parámetros inválidos";
        }
    }
}
