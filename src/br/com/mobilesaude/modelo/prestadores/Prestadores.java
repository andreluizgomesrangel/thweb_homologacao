package br.com.mobilesaude.modelo.prestadores;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Prestadores")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prestadores {
	long id;
	long id_operadoras;
	String nome;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_operadoras() {
		return id_operadoras;
	}
	public void setId_operadoras(long id_operadoras) {
		this.id_operadoras = id_operadoras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Prestadores [id=" + id + ", id_operadoras=" + id_operadoras + ", nome=" + nome + "]";
	}
}
