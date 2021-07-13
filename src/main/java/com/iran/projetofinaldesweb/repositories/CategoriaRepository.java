package com.iran.projetofinaldesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iran.projetofinaldesweb.domain.Categoria;

@Repository  
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer>{

	

}
