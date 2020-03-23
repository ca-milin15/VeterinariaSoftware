package com.co.veterinaria.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.veterinaria.modelo.TipoServicio;
import com.co.veterinaria.servicio.ITipoServicio;
@Service
public class TipoServicioImplementacion implements ITipoServicio{
	
	@Autowired
	public ITipoServicio TipoServicio;

	@Override
	public List<com.co.veterinaria.modelo.TipoServicio> ListarTipoServicio() {
		return TipoServicio.ListarTipoServicio();
	}

	@Override
	public Boolean guardarTipoServicio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminaTipoServicio() {
		// TODO Auto-generated method stub
		return null;
	}

}
