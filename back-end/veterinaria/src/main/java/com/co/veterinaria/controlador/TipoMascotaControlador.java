package com.co.veterinaria.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.veterinaria.compartidos.dto.TipoMascotaDto;
import com.co.veterinaria.modelo.TipoMascota;
import com.co.veterinaria.servicio.ITipoMascota;

@RestController
@RequestMapping("/tipoMascota")
public class TipoMascotaControlador{

	public ITipoMascota iTipoMascota;
	
	/**
	 * @author Camilo Rivera 
	 * @date 05-mar.-2020 17:04:40
	 */
	@Autowired
	public TipoMascotaControlador(ITipoMascota iTipoMascota) {
		this.iTipoMascota = iTipoMascota;
	}

	//localhost:8080/softwareVeterinaria/tipoMascota/listar  Method: GET
	@GetMapping("listar")
	public List<TipoMascotaDto> listarTipoMascota(){
		List<TipoMascotaDto> listaTipoMascota = iTipoMascota.listarTipoMascota();
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
