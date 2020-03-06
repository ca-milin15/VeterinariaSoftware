/**
 * 
 */
package com.co.veterinaria.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Camilo Rivera 
 * @date 02-mar.-2020 21:35:47
 */
@Entity
@Table(name="usuario")
public class Usuario extends EntidadGenerica{

	private static final long serialVersionUID = -2120091874521953513L;
	
	public String nombre;
	
	public String apellidos;
	
	/**
	 * @author Camilo Rivera 
	 * @date 02-mar.-2020 21:47:52
	 */
	public Usuario() {
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
}
