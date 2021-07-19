package com.iran.projetodesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iran.projetodesweb.domain.Categoria;

@Repository  
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer>{

	

}
