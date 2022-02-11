package com.example.demoSpringBootRuben;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private String nombre;
    private String edad;
    private String ciudad;

}
