package com.co.veterinaria.servicio;
import java.util.List;

public interface IHistoriaClinica {
	
	List<IHistoriaClinica> listarHistoriaClinica();
	
	Boolean guardarHistoriaCliente();
	
	Boolean eliminarHistoriaClinica();
	
}
