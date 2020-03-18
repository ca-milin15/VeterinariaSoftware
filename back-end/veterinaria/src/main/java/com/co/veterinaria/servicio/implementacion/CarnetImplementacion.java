package com.co.veterinaria.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.veterinaria.servicio.ICarnet;

@Service
public class CarnetImplementacion implements ICarnet{
	
	@Autowired
	public ICarnet Carnet;

	@Override
	public List<com.co.veterinaria.modelo.Carnet> ListarCarnet(){
		return Carnet.ListarCarnet();
	}

	@Override
	public Boolean guardarCarnet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarCarnet() {
		// TODO Auto-generated method stub
		return null;
	}
	

	


}
