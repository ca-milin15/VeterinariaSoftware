package com.co.veterinaria.servicio;
import java.util.List;

public interface ITipoServicio {
	
	List<com.co.veterinaria.modelo.TipoServicio> ListarTipoServicio();
	
	Boolean guardarTipoServicio();
	Boolean eliminaTipoServicio();

}
