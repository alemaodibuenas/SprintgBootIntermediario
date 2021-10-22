package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Integer> {
	
	List<Funcionario> findByChave(Long chave);
}
