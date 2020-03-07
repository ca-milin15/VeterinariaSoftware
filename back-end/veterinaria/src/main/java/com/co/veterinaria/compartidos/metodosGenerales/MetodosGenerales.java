/**
 * 
 */
package com.co.veterinaria.compartidos.metodosGenerales;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author Camilo Rivera 
 * @date 07-mar.-2020 14:39:58
 */
public class MetodosGenerales {

	public static Long convertirDesdeLocalDateTimeALong(LocalDateTime fecha) {
		return fecha.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
	}
}
