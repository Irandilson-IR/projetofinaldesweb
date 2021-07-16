package com.iran.projetofinaldesweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.iran.projetofinaldesweb.domain.Categoria;
import com.iran.projetofinaldesweb.dto.CategoriaDTO;
import com.iran.projetofinaldesweb.repositories.CategoriaRepository;
import com.iran.projetofinaldesweb.services.exceptions.DataIntegrityException;
import com.iran.projetofinaldesweb.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService { //Classe responsável pela consulta no repository
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}

		public Categoria insert(Categoria obj) {
			obj.setId(null);
			return repo.save(obj);
		}
		
		public Categoria update(Categoria obj) {
			Categoria newObj = find(obj.getId());
			updateData(newObj, obj);
			return repo.save(newObj);
		}
		
		public void delete(Integer id) {
			find(id);
			try {
				repo.deleteById(id);
			}
			catch (DataIntegrityViolationException e) {
				throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos");
			}
		}
		public List<Categoria> findAll() {
			return repo.findAll();
		}
		
		//Recursos de Paginação
		public Page<Categoria> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
			PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
			return repo.findAll(pageRequest);
		}
		
		public Categoria fromDTO(CategoriaDTO objDto) {
			return new Categoria(objDto.getId(), objDto.getNome());
		}
		
		private void updateData(Categoria newObj, Categoria obj) {
			newObj.setNome(obj.getNome());
			
		}
		
		}
		
		
		
	




