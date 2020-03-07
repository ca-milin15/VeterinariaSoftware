/**
 * 
 */
package com.co.veterinaria.compartidos.dto;

import com.co.veterinaria.compartidos.metodosGenerales.MetodosGenerales;
import com.co.veterinaria.modelo.Usuario;

/**
 * @author Camilo Rivera 
 * @date 07-mar.-2020 14:27:03
 */
public class UsuarioDto extends EntidadGeneralDto{

	private static final long serialVersionUID = -4224921136689845255L;
	
	public String nombre;
	
	public String apellidos;

	/**
	 * @author Camilo Rivera 
	 * @date 07-mar.-2020 14:28:38
	 */
	public UsuarioDto() {
	}

	/**
	 * @author Camilo Rivera 
	 * @date 07-mar.-2020 14:44:01
	 * @param usuarioCreacion
	 */
	public UsuarioDto(Usuario usuarioCreacion) {
		setId(id);
		setFechaCreacion(MetodosGenerales.convertirDesdeLocalDateTimeALong(usuarioCreacion.getFechaCreacion()));
		setFechaActualizacion(MetodosGenerales.convertirDesdeLocalDateTimeALong(usuarioCreacion.getFechaActualizacion()));
		setUsuarioCreacion(usuarioCreacion.getUsuarioCreacion() != null ? new UsuarioDto(usuarioCreacion.getUsuarioCreacion()) : null);
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
