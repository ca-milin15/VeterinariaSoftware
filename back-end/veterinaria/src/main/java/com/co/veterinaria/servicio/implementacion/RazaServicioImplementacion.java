package com.co.veterinaria.servicio.implementacion;

import com.co.veterinaria.servicio.Raza;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RazaServicioImplementacion implements Raza {

	@Autowired
	public Raza Raza;
	
	@Override
	public List<com.co.veterinaria.modelo.Raza> ListarRaza() {
		return Raza.ListarRaza();
	}

	@Override
	public Boolean guardarRaza() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminaRaza() {
		// TODO Auto-generated method stub
		return null;
	}

}
