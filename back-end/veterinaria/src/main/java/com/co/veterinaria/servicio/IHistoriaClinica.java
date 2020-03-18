package com.co.veterinaria.servicio;
import java.util.List;

public interface IHistoriaClinica {
	
	List<com.co.veterinaria.modelo.HistoriaClinica> listarHistoriaClinica();
	
	Boolean guardarHistoriaCliente();
	
	Boolean eliminarHistoriaClinica();
	
}
