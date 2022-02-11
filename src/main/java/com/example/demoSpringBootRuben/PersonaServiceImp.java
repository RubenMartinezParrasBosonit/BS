package com.example.demoSpringBootRuben;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements  PersonaService{

    Persona persona = new Persona();

    public String getNombre(){
        return persona.getNombre();
    }

    public void setNombre(String nombre){
        persona.setNombre(nombre);
    }

    public void set(String key, String value){
        if(key.equals("nombre")){
            persona.setNombre(value);
        }else if(key.equals("ciudad")){
            persona.setCiudad(value);
        }else if(key.equals("edad")){
            persona.setEdad(value);
        }
    }

    public void setEdad(String edad){
        persona.setEdad(edad);
    }

    public String getEdad(){
        return persona.getEdad();
    }

    public void setCiudad(String ciudad){
        persona.setCiudad(ciudad);
    }

    @Override
    public String toString() {
        return "PersonaServiceImp{" +
                "persona=" + persona +
                '}';
    }
}
