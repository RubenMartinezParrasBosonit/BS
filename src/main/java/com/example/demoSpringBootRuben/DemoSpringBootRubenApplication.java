package com.example.demoSpringBootRuben;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootRubenApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoSpringBootRubenApplication.class, args);

	}

	/*@Bean
	PersonaService getPersonaService(){
		PersonaService p = new PersonaServiceImp();
		p.setNombre("El del bean");
		return p;
	}*/
}
