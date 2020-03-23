package com.co.veterinaria.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.veterinaria.servicio.IServicio;

@Service
public class ServicioImplementacion implements IServicio {

	@Autowired
	public IServicio Servicio;	
	
	@Override
	public List<com.co.veterinaria.modelo.Servicio> ListarServicio() {
		// TODO Auto-generated method stub
		return Servicio.ListarServicio();
	}

	@Override
	public Boolean guardarServicio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminaServicio() {
		// TODO Auto-generated method stub
		return null;
	}

}
