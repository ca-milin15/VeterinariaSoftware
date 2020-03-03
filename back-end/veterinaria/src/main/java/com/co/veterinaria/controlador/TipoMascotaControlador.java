package com.co.veterinaria.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.veterinaria.modelo.TipoMascota;

@RestController
@RequestMapping("tipoMascota/")
public class TipoMascotaControlador{

	@Autowired
	public com.co.veterinaria.servicio.TipoMascota tipoMascota;
	
	//localhost:8080/softwareVeterinaria/tipoMascota/listar  Method: GET
	@GetMapping("listar")
	public List<TipoMascota> listarTipoMascota(){
		List<TipoMascota> listaTipoMascota = tipoMascota.listarTipoMascota();
		return listaTipoMascota;
	}

	//localhost:8080/softwareVeterinaria/tipoMascota/guardar Method: POST
	@PostMapping("guardar")
	public boolean guardarTipoMascota(@RequestBody TipoMascota tipoMascota){
		
		return false;
	}

	//localhost:8080/softwareVeterinaria/tipoMascota/guardar Method: PUT
	@PostMapping("actualizar")
	public boolean actualizarTipoMascota(@RequestBody TipoMascota tipoMascota){
		
		return false;
	}
} 
