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
import com.co.veterinaria.servicio.IMascota;

@RestController
@RequestMapping("/mascota")
public class MascotaControlador{
	
	public IMascota mascota;
	
	
	/**
	 * @author Camilo Rivera 
	 * @date 05-mar.-2020 17:01:33
	 */
	@Autowired
	public MascotaControlador(IMascota mascota) {
		this.mascota = mascota;
	}

	//localhost:8080/softwareVeterinaria/mascota/listar  Method: GET
	@GetMapping("listar")
	public List<Mascota> ListarMascota()
	{
		List<Mascota> listaMascota = mascota.listarMascota();
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
