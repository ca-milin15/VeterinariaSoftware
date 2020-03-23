package com.co.veterinaria.servicio;
import java.util.List;

public interface IServicio {
	
	List<com.co.veterinaria.modelo.Servicio> ListarServicio();
	
	
	Boolean guardarServicio();
	Boolean eliminaServicio();	

}
