package com.iran.projetodesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iran.projetodesweb.domain.Endereco;

@Repository  
public interface EnderecoRepository  extends JpaRepository<Endereco, Integer>{

	

}