package com.co.veterinaria.servicio;
import java.util.List;
public interface Raza {
	
	List<com.co.veterinaria.modelo.Raza> ListarRaza();
	
	Boolean guardarRaza();
	Boolean eliminaRaza();

}
