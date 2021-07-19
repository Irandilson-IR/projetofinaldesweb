package com.iran.projetodesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iran.projetodesweb.domain.Pagamento;

@Repository  
public interface PagamentoRepository  extends JpaRepository<Pagamento, Integer>{

	

}
