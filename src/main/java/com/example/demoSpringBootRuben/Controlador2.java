package com.example.demoSpringBootRuben;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controlador2 {

    @Autowired
    @Qualifier("PersonaServiceImp")
    PersonaService personaService;

    @Autowired
    ArrayList<CiudadService> ciudades;

    @GetMapping("/controlador2/getPersona")
    String getControlador2(){
        personaService.setEdad(String.valueOf(Integer.parseInt(personaService.getEdad())*2));
        return personaService.toString();
    }

    @GetMapping("/controlador2/getciudad")
    public String getCiudades(){
        return ciudades.toString();
    }

}
