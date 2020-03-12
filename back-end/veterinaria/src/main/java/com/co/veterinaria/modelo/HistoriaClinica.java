package com.co.veterinaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * @author Alexis Viana 
 * @date 
 */


@Entity
@Table(name="historiaclinica")
public class HistoriaClinica extends EntidadGenerica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9013647110685144590L;
	@Column(name="nombre")
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
