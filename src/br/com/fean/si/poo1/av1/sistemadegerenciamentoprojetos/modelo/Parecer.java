package br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.modelo;

import java.util.HashMap;

public class Parecer {
	
	private Integer id;
	private String data;
	private String nomeResponsavel;
	private String consideracoes;
	private HashMap<String, Projeto> projetos;
	
	
	
	
	
	public Parecer(Integer id, String data, String nomeResponsavel, String consideracoes,
			HashMap<String, Projeto> projetos) {
		this.id = id;
		this.data = data;
		this.nomeResponsavel = nomeResponsavel;
		this.consideracoes = consideracoes;
		this.projetos = projetos;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public String getConsideracoes() {
		return consideracoes;
	}
	public void setConsideracoes(String consideracoes) {
		this.consideracoes = consideracoes;
	}
	
	public HashMap<String, Projeto> getProjeto(){
		return projetos;
	}
	
	
	

}
