/**
 * 
 */
package com.co.veterinaria.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Camilo Rivera
 * @date 02-mar.-2020 21:32:31
 */
public class EntidadGenerica implements Serializable{

	private static final long serialVersionUID = -6990968890603578140L;

	public Integer id;

	public LocalDateTime fechaCreacion;

	public LocalDateTime fechaActualizacion;

	public Usuario usuarioCreacion;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion
	 *            the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaActualizacion
	 */
	public LocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}

	/**
	 * @param fechaActualizacion
	 *            the fechaActualizacion to set
	 */
	public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	/**
	 * @return the usuarioCreacion
	 */
	public Usuario getUsuarioCreacion() {
		return usuarioCreacion;
	}

	/**
	 * @param usuarioCreacion
	 *            the usuarioCreacion to set
	 */
	public void setUsuarioCreacion(Usuario usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

}
