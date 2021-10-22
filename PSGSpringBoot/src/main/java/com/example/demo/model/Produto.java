package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProdutoID")	
	private Integer produtoID;
	
	@Column(name = "SubCategoriaID")	
	private Integer subCategoriaID;

	@Column(name = "CategoriaID")
	private Integer categoriaID;
	
	@Column(name = "Descricao")	
	private String descricao;
	
	@Column(name = "Inclusao", nullable = true)
	@Temporal(value = TemporalType.DATE)
	private Date dataInsert;

	public Integer getProdutoID() {
		return produtoID;
	}

	public void setProdutoID(Integer produtoID) {
		this.produtoID = produtoID;
	}

	public Integer getSubCategoriaID() {
		return subCategoriaID;
	}

	public void setSubCategoriaID(Integer subCategoriaID) {
		this.subCategoriaID = subCategoriaID;
	}

	public Integer getCategoriaID() {
		return categoriaID;
	}

	public void setCategoriaID(Integer categoriaID) {
		this.categoriaID = categoriaID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInsert() {
		return dataInsert;
	}

	public void setDataInsert(Date dataInsert) {
		this.dataInsert = dataInsert;
	}

	public Produto(Integer produtoID, Integer subCategoriaID, Integer categoriaID, String descricao, Date dataInsert) {
		super();
		this.produtoID = produtoID;
		this.subCategoriaID = subCategoriaID;
		this.categoriaID = categoriaID;
		this.descricao = descricao;
		this.dataInsert = dataInsert;
	}
	
	public Produto() {}

	@Override
	public String toString() {
		return "Produto [produtoID=" + produtoID + ", subCategoriaID=" + subCategoriaID + ", categoriaID=" + categoriaID
				+ ", descricao=" + descricao + ", dataInsert=" + dataInsert + "]";
	}	

}
