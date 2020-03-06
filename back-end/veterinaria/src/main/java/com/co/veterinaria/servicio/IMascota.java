package com.co.veterinaria.servicio;

import java.util.List;

public interface IMascota {

	List<com.co.veterinaria.modelo.Mascota> listarMascota();
	
	Boolean guardarMascota();
	
	Boolean eliminaMascota();
}
