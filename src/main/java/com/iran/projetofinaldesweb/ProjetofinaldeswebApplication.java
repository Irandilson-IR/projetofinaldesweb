package com.iran.projetofinaldesweb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iran.projetofinaldesweb.domain.Categoria;
import com.iran.projetofinaldesweb.repositories.CategoriaRepository;

@SpringBootApplication
public class ProjetofinaldeswebApplication implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetofinaldeswebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informátia");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	
	}

}
