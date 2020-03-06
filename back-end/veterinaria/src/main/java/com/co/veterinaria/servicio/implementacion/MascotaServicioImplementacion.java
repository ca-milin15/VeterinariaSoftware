package com.co.veterinaria.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.veterinaria.modelo.dao.MascotaDAO;
import com.co.veterinaria.servicio.IMascota;


@Service
public class MascotaServicioImplementacion implements IMascota{

	@Autowired
	public MascotaDAO MascotaDao;
	
	
	@Override
	public List<com.co.veterinaria.modelo.Mascota> listarMascota() {
		// TODO Auto-generated method stub
		return MascotaDao.findAll();
	}

	@Override
	public Boolean guardarMascota() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminaMascota() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
