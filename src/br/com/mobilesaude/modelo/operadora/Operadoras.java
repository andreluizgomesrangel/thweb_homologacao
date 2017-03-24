package br.com.mobilesaude.modelo.operadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Operadora")
@XmlAccessorType(XmlAccessType.FIELD) 
public class Operadoras {
	@XmlElement(name="Id")
	long id;
	@XmlElement(name="Descricao")
	String descricao;
	@XmlElement(name="Prestadores")
	int prestadores;
	@XmlElement(name="Nome")
	String nome;
	
	@XmlElement(name="Situacao")
	String situacao;
	
	@XmlElement(name="Erro")
	int erro;
	@XmlElement(name="Pendente")
	int pendente;
	@XmlElement(name="Ok")
	int ok;
	@XmlElement(name="Importado")
	int importado;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPrestadores() {
		return prestadores;
	}
	public void setPrestadores(int prestadores) {
		this.prestadores = prestadores;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public int getErro() {
		return erro;
	}
	public void setErro(int erro) {
		this.erro = erro;
	}
	public int getPendente() {
		return pendente;
	}
	public void setPendente(int pendente) {
		this.pendente = pendente;
	}
	public int getOk() {
		return ok;
	}
	public void setOk(int ok) {
		this.ok = ok;
	}
	public int getImportado() {
		return importado;
	}
	public void setImportado(int importado) {
		this.importado = importado;
	}
	
}
