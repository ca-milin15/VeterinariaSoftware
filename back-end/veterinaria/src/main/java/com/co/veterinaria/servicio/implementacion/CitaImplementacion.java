package com.co.veterinaria.servicio.implementacion;

import com.co.veterinaria.servicio.ICita;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class CitaImplementacion implements ICita{
	
	 @Autowired
	 public ICita Cita;
	 
	 @Override 
	 public List<com.co.veterinaria.modelo.Cita> ListarCita(){
		 return Cita.ListarCita();
	 }
	 
	 @Override
	 public Boolean guardarCita() {
		 return null;
	
	 }

	@Override
	public Boolean eliminaCita() {
		// TODO Auto-generated method stub
		return null;
	}
}
