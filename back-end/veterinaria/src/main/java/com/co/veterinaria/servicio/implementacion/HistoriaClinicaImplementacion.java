package com.co.veterinaria.servicio.implementacion;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.veterinaria.modelo.dao.HistoriaClinicaDAO;
import com.co.veterinaria.servicio.IHistoriaClinica;

@Service
public class HistoriaClinicaImplementacion implements IHistoriaClinica {
	
	@Autowired
	public HistoriaClinicaDAO historiaCLinica;

	@Override
	public List<com.co.veterinaria.modelo.HistoriaClinica> listarHistoriaClinica() {
		
		return null;
	}

	@Override
	public Boolean guardarHistoriaCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarHistoriaClinica() {
		// TODO Auto-generated method stub
		return null;
	} 

}
