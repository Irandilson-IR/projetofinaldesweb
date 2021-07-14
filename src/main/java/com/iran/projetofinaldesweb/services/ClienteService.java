package com.iran.projetofinaldesweb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iran.projetofinaldesweb.domain.Cliente;
import com.iran.projetofinaldesweb.repositories.ClienteRepository;
import com.iran.projetofinaldesweb.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService { //Classe responsável pela consulta no repository
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}


	}




