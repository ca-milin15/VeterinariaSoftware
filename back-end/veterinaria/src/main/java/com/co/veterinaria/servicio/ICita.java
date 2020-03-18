package com.co.veterinaria.servicio;
import java.util.List;

public interface ICita {
	List<com.co.veterinaria.modelo.Cita> ListarCita();
	
	Boolean guardarCita();
	Boolean eliminaCita();

}
