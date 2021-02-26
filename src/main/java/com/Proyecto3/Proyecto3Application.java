package com.Proyecto3;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Proyecto3.entities.Usuario;
import com.Proyecto3.repositorios.UsuarioRepository;


@SpringBootApplication
public class Proyecto3Application implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarfioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Proyecto3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Usuario usuario1 = new Usuario ("Jorge","Pallol","jorgepallol1@gmail.com","541298S");
		List<Usuario> usua =  Arrays.asList(usuario1);
		
		//usuarfioRepository.save(usua);
		
	}

}
