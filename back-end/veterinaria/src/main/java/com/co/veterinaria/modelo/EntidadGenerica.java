/**
 * 
 */
package com.co.veterinaria.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 * @author Camilo Rivera
 * @date 02-mar.-2020 21:32:31
 */
@MappedSuperclass
public class EntidadGenerica implements Serializable{

	private static final long serialVersionUID = -6990968890603578140L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column(name="fechacreacion")
	public LocalDateTime fechaCreacion;

	@Column(name="fechaactualizacion")
	public LocalDateTime fechaactualizacion;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name= "usuariocreacionid")
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
		return fechaactualizacion;
	}

	/**
	 * @param fechaActualizacion
	 *            the fechaActualizacion to set
	 */
	public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
		this.fechaactualizacion = fechaActualizacion;
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
