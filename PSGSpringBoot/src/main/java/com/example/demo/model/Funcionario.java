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
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FuncionarioID")	
	private Integer 	FuncionarioID;
	
	@Column(name = "Chave")	
	private Long 	chave;
	
	@Column(name = "Nome")	
	private String 		nome;
	
	@Column(name = "SobreNome")	
	private String 		sobreNome;
	
	@Column(name = "Sexo")	
	private String 		sexo;
	
	@Column(name = "DataNascimento")	
	private Date 		dataNascimento;
	
	@Column(name = "Email")	
	private String 		eMail;
	
	@Column(name = "CodigoPais")	
	private Integer 	codigoPais;
	
	@Column(name = "DataAdmissao")	
	private Date 		dataAdmissao;
	
	@Column(name = "Ctps")	
	private String		Ctps;
	
	@Column(name = "CtpsNum")	
	private Integer		CtpsNum;
	
	@Column(name = "CtpsSerie")	
	private Integer		CtpsSerie;
	
	@Column(name = "Inclusao", nullable = true)
	@Temporal(value = TemporalType.DATE)	
	private Date		DataInsert;

	public Integer getFuncionarioID() {
		return FuncionarioID;
	}

	public void setFuncionarioID(Integer funcionarioID) {
		FuncionarioID = funcionarioID;
	}

	public Long getChave() {
		return chave;
	}

	public void setChave(Long chave) {
		this.chave = chave;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Integer getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCtps() {
		return Ctps;
	}

	public void setCtps(String ctps) {
		Ctps = ctps;
	}

	public Integer getCtpsNum() {
		return CtpsNum;
	}

	public void setCtpsNum(Integer ctpsNum) {
		CtpsNum = ctpsNum;
	}

	public Integer getCtpsSerie() {
		return CtpsSerie;
	}

	public void setCtpsSerie(Integer ctpsSerie) {
		CtpsSerie = ctpsSerie;
	}

	public Date getDataInsert() {
		return DataInsert;
	}

	public void setDataInsert(Date dataInsert) {
		DataInsert = dataInsert;
	}

	public Funcionario(Integer funcionarioID, Long chave, String nome, String sobreNome, String sexo,
			Date dataNascimento, String eMail, Integer codigoPais, Date dataAdmissao, String ctps, Integer ctpsNum,
			Integer ctpsSerie, Date dataInsert) {
		super();
		FuncionarioID = funcionarioID;
		this.chave = chave;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.eMail = eMail;
		this.codigoPais = codigoPais;
		this.dataAdmissao = dataAdmissao;
		Ctps = ctps;
		CtpsNum = ctpsNum;
		CtpsSerie = ctpsSerie;
		DataInsert = dataInsert;
	}
	
	public Funcionario() {}

	@Override
	public String toString() {
		return "Funcionario [FuncionarioID=" + FuncionarioID + ", chave=" + chave + ", nome=" + nome + ", sobreNome="
				+ sobreNome + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", eMail=" + eMail
				+ ", codigoPais=" + codigoPais + ", dataAdmissao=" + dataAdmissao + ", Ctps=" + Ctps + ", CtpsNum="
				+ CtpsNum + ", CtpsSerie=" + CtpsSerie + ", DataInsert=" + DataInsert + "]";
	}	

}
