package com.iran.projetofinaldesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iran.projetofinaldesweb.domain.Endereco;

@Repository  
public interface EnderecoRepository  extends JpaRepository<Endereco, Integer>{

	

}
