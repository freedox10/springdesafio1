package com.aluracursos.springdesafio1;

import com.aluracursos.springdesafio1.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springdesafio1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springdesafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
