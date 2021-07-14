package com.iran.projetofinaldesweb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iran.projetofinaldesweb.domain.Pedido;
import com.iran.projetofinaldesweb.repositories.PedidoRepository;
import com.iran.projetofinaldesweb.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService { //Classe responsável pela consulta no repository
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}


	}




