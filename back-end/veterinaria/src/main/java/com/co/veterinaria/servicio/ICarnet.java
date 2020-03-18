package com.co.veterinaria.servicio;

import java.util.List;

public interface ICarnet {
	
	List<com.co.veterinaria.modelo.Carnet> ListarCarnet();
	
	Boolean guardarCarnet();
	
	Boolean eliminarCarnet();

}
