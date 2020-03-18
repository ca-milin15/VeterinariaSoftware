package com.co.veterinaria.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.co.veterinaria.modelo.Carnet;

@RestController
@RequestMapping("/carnet")
public class CarnetControlador {
	
	@Autowired
	public com.co.veterinaria.servicio.ICarnet Carnet;
	
	//localhost:8080/softwareVeterinaria/carnet/listar  Method: GET
	@GetMapping("listar")
	public List<Carnet> ListarCarnet()
	{
		List<Carnet> listaCarnet = Carnet.ListarCarnet();
		return listaCarnet;
	}
	
	//localhost:8080/softwareVeterinaria/carnet/guardar Method: POST
	@PostMapping("guardar")
	public boolean guardarCarnet(@RequestBody Carnet Carnet){
		
		return false;
	}

	//localhost:8080/softwareVeterinaria/carnet/actualizar Method: PUT
	@PostMapping("actualizar")
	public boolean actualizarCarnet(@RequestBody Carnet Carnet){
		
		return false;
	}
	
	//localhost:8080/softwareVeterinaria/carnet/eliminar Method: DELETE
	@DeleteMapping("eliminar")
	public boolean eliminarCarnet(@RequestBody Carnet Carnet) {
		return false;
	}

}
