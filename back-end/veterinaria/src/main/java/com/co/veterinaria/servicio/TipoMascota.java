package com.co.veterinaria.servicio;

import java.util.List;

public interface TipoMascota {

	List<com.co.veterinaria.modelo.TipoMascota> listarTipoMascota();
	
	Boolean guardarTipoMascota();
	
	Boolean eliminarTipoMascota();
}
