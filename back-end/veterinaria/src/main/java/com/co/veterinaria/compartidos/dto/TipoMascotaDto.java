/**
 * 
 */
package com.co.veterinaria.compartidos.dto;

import com.co.veterinaria.compartidos.metodosGenerales.MetodosGenerales;
import com.co.veterinaria.modelo.TipoMascota;

/**
 * @author Camilo Rivera 
 * @date 07-mar.-2020 14:25:24
 */
public class TipoMascotaDto extends EntidadGeneralDto{

	private static final long serialVersionUID = -3875002682508289144L;

	public String nombre;
	
	/**
	 * @author Camilo Rivera 
	 * @date 07-mar.-2020 14:30:28
	 */
	public TipoMascotaDto() {
	}

	/**
	 * @author Camilo Rivera 
	 * @date 07-mar.-2020 14:36:50
	 * @param tipoMascota
	 */
	public TipoMascotaDto(TipoMascota tipoMascota) {
		setId(tipoMascota.getId());
		this.nombre = tipoMascota.getNombre();
		setFechaCreacion(MetodosGenerales.convertirDesdeLocalDateTimeALong(tipoMascota.getFechaCreacion()));
		setFechaActualizacion(MetodosGenerales.convertirDesdeLocalDateTimeALong(tipoMascota.getFechaActualizacion()));
		setUsuarioCreacion(tipoMascota.getUsuarioCreacion().getId() != 0 ? new UsuarioDto(tipoMascota.getUsuarioCreacion()) : null);
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
