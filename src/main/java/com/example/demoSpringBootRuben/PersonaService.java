package com.example.demoSpringBootRuben;

import lombok.Data;
import lombok.ToString;

public interface PersonaService {

    String getNombre();
    void setNombre(String nombre);
    void setCiudad(String ciudad);
    void setEdad(String edad);
    void set(String key, String value);
    String getEdad();
    void createPersona(Persona persona);
    public String toString();


}
