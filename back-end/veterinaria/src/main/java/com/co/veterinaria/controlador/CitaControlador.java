package com.co.veterinaria.controlador;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.veterinaria.modelo.Cita;


@RestController
@RequestMapping("/cita")
public class CitaControlador {
	
	@Autowired
	public com.co.veterinaria.servicio.ICita Cita;
	
	//localhost:8080/softwareVeterinaria/cita/listar  Method: GET
	@GetMapping("listar")
	public List<Cita> ListarCita()
	{
		List<Cita> listaCita = Cita.ListarCita();
		return listaCita;
	}
	
	//localhost:8080/softwareVeterinaria/cita/guardar Method: POST
	@PostMapping("guardar")
	public boolean guardarCita(@RequestBody Cita Cita){
		
		return false;
	}

	//localhost:8080/softwareVeterinaria/cita/actualizar Method: PUT
	@PostMapping("actualizar")
	public boolean actualizarCita(@RequestBody Cita Cita){
		
		return false;
	}
	
	//localhost:8080/softwareVeterinaria/cita/eliminar Method: DELETE
	@DeleteMapping("eliminar")
	public boolean eliminarCita(@RequestBody Cita Cita) {
		return false;
	}

}
