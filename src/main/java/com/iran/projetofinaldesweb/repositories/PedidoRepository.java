package com.iran.projetofinaldesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iran.projetofinaldesweb.domain.Pedido;

@Repository  
public interface PedidoRepository  extends JpaRepository<Pedido, Integer>{

	

}
