/**
 * 
 */
package com.co.veterinaria.compartidos.dto;

import java.io.Serializable;

/**
 * @author Camilo Rivera
 * @date 07-mar.-2020 14:26:19
 */
public class EntidadGeneralDto implements Serializable {

	private static final long serialVersionUID = -8547880262208806135L;

	public int id;

	public Long fechaCreacion;

	public Long fechaActualizacion;

	public UsuarioDto usuarioCreacion;

	/**
	 * @author Camilo Rivera
	 * @date 07-mar.-2020 14:29:05
	 */
	public EntidadGeneralDto() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Long getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion
	 *            the fechaCreacion to set
	 */
	public void setFechaCreacion(Long fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaActualizacion
	 */
	public Long getFechaActualizacion() {
		return fechaActualizacion;
	}

	/**
	 * @param fechaActualizacion
	 *            the fechaActualizacion to set
	 */
	public void setFechaActualizacion(Long fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	/**
	 * @return the usuarioCreacion
	 */
	public UsuarioDto getUsuarioCreacion() {
		return usuarioCreacion;
	}

	/**
	 * @param usuarioCreacion
	 *            the usuarioCreacion to set
	 */
	public void setUsuarioCreacion(UsuarioDto usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
