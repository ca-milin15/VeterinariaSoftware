package com.co.veterinaria.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tiposervicio")
public class TipoServicio extends EntidadGenerica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -392083285081563952L;
	
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
