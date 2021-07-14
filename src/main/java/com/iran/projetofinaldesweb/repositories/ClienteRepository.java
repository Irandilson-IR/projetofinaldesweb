package com.iran.projetofinaldesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iran.projetofinaldesweb.domain.Cliente;

@Repository  
public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

	

}
