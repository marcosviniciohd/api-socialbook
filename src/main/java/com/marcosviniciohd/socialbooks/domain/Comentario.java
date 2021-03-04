package com.marcosviniciohd.socialbooks.domain;

import java.util.Date;

public class Comentario {
	
	private Long id;
	
	private String texto;
	
	private String usuário;
	
	private Date data;
	
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getUsuário() {
		return usuário;
	}

	public void setUsuário(String usuário) {
		this.usuário = usuário;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	

}
