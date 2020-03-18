package com.co.veterinaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cita")
public class Cita extends EntidadGenerica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8113028418315850462L;
	
	@Column(name = "recursoVeterinaria")
	public Integer recursoVeterinaria;
	
	@Column (name = "estado")
	public char estado;

	public Integer getRecursoVeterinaria() {
		return recursoVeterinaria;
	}

	public void setRecursoVeterinaria(Integer recursoVeterinaria) {
		this.recursoVeterinaria = recursoVeterinaria;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}
	
}
