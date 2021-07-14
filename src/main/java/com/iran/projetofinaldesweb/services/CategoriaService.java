package com.iran.projetofinaldesweb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iran.projetofinaldesweb.domain.Categoria;
import com.iran.projetofinaldesweb.repositories.CategoriaRepository;
import com.iran.projetofinaldesweb.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService { //Classe responsável pela consulta no repository
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}

		public Categoria insert(Categoria obj) {
			obj.setId(null);
			return repo.save(obj);
		}
		
		public Categoria update(Categoria obj) {
			find(obj.getId());
			
			return repo.save(obj);
		}
	}




