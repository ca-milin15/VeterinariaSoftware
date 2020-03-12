package com.co.veterinaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="carnet")
public class Carnet extends EntidadGenerica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 509107590113104555L;
	
	@Column(name="codigo")
	public Integer codigo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	

}
