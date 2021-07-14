package com.iran.projetofinaldesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iran.projetofinaldesweb.domain.ItemPedido;

@Repository  
public interface ItemPedidoRepository  extends JpaRepository<ItemPedido, Integer>{

	

}
