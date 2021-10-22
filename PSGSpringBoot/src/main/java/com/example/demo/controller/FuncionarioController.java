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

import com.example.demo.model.Funcionario;
import com.example.demo.model.SubCategoria;
import com.example.demo.repository.IFuncionarioRepository;

@RestController
@RequestMapping(path = "/api")
public class FuncionarioController {
	
	@Autowired
	private IFuncionarioRepository repo;
	
	@GetMapping(path ="/funcionarios")
	public List<Funcionario> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping(path ="/funcionarios/{id}")
	public Funcionario getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
	@PostMapping(path ="/funcionarios")
	public Funcionario post(@RequestBody Funcionario funcionario) {
		return this.repo.save(funcionario);
	}
	
	@DeleteMapping(path ="/funcionarios/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) {
			this.repo.deleteById(id);
		}
	}
	
	@PutMapping(path ="/funcionarios")
	public Funcionario put(@RequestBody Funcionario novaFuncionario) {		
		return this.repo.findById(novaFuncionario.getFuncionarioID())
				.map(cat -> {
					cat.setFuncionarioID(novaFuncionario.getFuncionarioID());
					cat.setChave(novaFuncionario.getChave());
					cat.setNome(novaFuncionario.getNome());
					cat.setSobreNome(novaFuncionario.getSobreNome());
					cat.setSexo(novaFuncionario.getSexo());
					cat.setDataNascimento(novaFuncionario.getDataNascimento());
					cat.seteMail(novaFuncionario.geteMail());
					cat.setCodigoPais(novaFuncionario.getCodigoPais());
					cat.setDataAdmissao(novaFuncionario.getDataAdmissao());
					cat.setCtps(novaFuncionario.getCtps());
					cat.setCtpsNum(novaFuncionario.getCtpsNum());
					cat.setCtpsSerie(novaFuncionario.getCtpsSerie());
					cat.setDataInsert(novaFuncionario.getDataInsert());
					return this.repo.save(cat);
				})
				.orElse(null);		
	}	
	
	@GetMapping(path ="/funcionarios/porchave/{chave}")
	public List<Funcionario> getFuncionarioPorChave(@PathVariable Long chave){
		return this.repo.findByChave(chave);
	}
}
