package com.co.veterinaria.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio extends EntidadGenerica{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5365661940222923893L;
	
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
