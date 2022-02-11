package com.example.demoSpringBootRuben;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {
    @Autowired
    PersonaService personaService;

    @GetMapping("/controlador2/getPersona")
    String getControlador2(){
        personaService.setEdad(String.valueOf(Integer.parseInt(personaService.getEdad())*2));
        return personaService.toString();
    }

}