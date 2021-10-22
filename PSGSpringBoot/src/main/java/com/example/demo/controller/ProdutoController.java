package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Produto;
import com.example.demo.repository.IProdutoRepository;

@RestController
@RequestMapping(path = "/api")
public class ProdutoController {
	
	@Autowired
	private IProdutoRepository repo;
	
	@GetMapping(path ="/produtos")
	public List<Produto> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping(path ="/produtos/{id}")
	public Produto getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
	@PostMapping(path ="/produtos")
	public Produto post(@RequestBody Produto produto) {
		return this.repo.save(produto);
	}
	
	@DeleteMapping(path ="/produtos/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) {
			this.repo.deleteById(id);
		}
	}
	
	@PutMapping(path ="/produtos")
	public Produto put(@RequestBody Produto novaProduto) {		
		return this.repo.findById(novaProduto.getProdutoID())
				.map(cat -> {
					cat.setProdutoID(novaProduto.getProdutoID());
					cat.setSubCategoriaID(novaProduto.getSubCategoriaID());
					cat.setCategoriaID(novaProduto.getCategoriaID());
					cat.setDescricao(novaProduto.getDescricao());
					cat.setDataInsert(novaProduto.getDataInsert());
					return this.repo.save(cat);
				})
				.orElse(null);		
	}	
}
