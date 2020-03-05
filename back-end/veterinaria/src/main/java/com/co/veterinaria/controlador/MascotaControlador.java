package com.co.veterinaria.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.co.veterinaria.modelo.Mascota;
@RestController
@RequestMapping("mascota/")
public class MascotaControlador {
	
	@Autowired
	public com.co.veterinaria.servicio.Mascota Mascota;
	
	//localhost:8080/softwareVeterinaria/mascota/listar  Method: GET
	@GetMapping("listar")
	public List<Mascota> ListarMascota()
	{
		List<Mascota> listaMascota = Mascota.listarMascota();
		return listaMascota;
	}
	
	//localhost:8080/softwareVeterinaria/mascota/guardar Method: POST
	@PostMapping("guardar")
	public boolean guardarMascota(@RequestBody Mascota Mascota){
		
		return false;
	}

	//localhost:8080/softwareVeterinaria/mascota/actualizar Method: PUT
	@PostMapping("actualizar")
	public boolean actualizarMascota(@RequestBody Mascota Mascota){
		
		return false;
	}
	
	//localhost:8080/softwareVeterinaria/mascota/eliminar Method: DELETE
	@DeleteMapping("eliminar")
	public boolean eliminarMascota(@RequestBody Mascota Mascota) {
		return false;
	}

	
}
