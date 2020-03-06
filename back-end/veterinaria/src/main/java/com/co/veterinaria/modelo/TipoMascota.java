package com.co.veterinaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipomascota")
public class TipoMascota extends EntidadGenerica {

	private static final long serialVersionUID = 5091523957313310208L;

	@Column(name="nombre")
	public String nombre;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
