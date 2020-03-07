package com.co.veterinaria.servicio;

import java.util.List;

import com.co.veterinaria.compartidos.dto.TipoMascotaDto;

public interface ITipoMascota {

	List<TipoMascotaDto> listarTipoMascota();
	
	Boolean guardarTipoMascota();
	
	Boolean eliminarTipoMascota();
}
