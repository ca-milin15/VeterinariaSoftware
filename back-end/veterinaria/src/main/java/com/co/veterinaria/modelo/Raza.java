package com.co.veterinaria.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="raza")
public class Raza extends EntidadGenerica {

	private static final long serialVersionUID = 4105068328835744076L;
	
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
