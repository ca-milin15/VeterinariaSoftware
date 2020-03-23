package com.co.veterinaria.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.veterinaria.modelo.TipoServicio;

@RestController
@RequestMapping("/tiposervicio")
public class TipoServicioControlador {
	
	@Autowired
	public com.co.veterinaria.servicio.ITipoServicio TipoServicio;
	
	//localhost:8080/softwareVeterinaria/tiposervicio/listar  Method: GET
	@GetMapping("listar")
	public List<TipoServicio> ListarTipoServicio()
	{
		List<TipoServicio> listaTipoServicio = TipoServicio.ListarTipoServicio();
		return listaTipoServicio;
	}
	
	//localhost:8080/softwareVeterinaria/tiposervicio/guardar Method: POST
	@PostMapping("guardar")
	public boolean guardarTipoServicio(@RequestBody TipoServicio TipoServicio){
		
		return false;
	}

	//localhost:8080/softwareVeterinaria/tiposervicio/actualizar Method: PUT
	@PostMapping("actualizar")
	public boolean actualizarTipoServicio(@RequestBody TipoServicio TipoServicio){
		
		return false;
	}
	
	//localhost:8080/softwareVeterinaria/tiposervicio/eliminar Method: DELETE
	@DeleteMapping("eliminar")
	public boolean eliminarTipoServicio(@RequestBody TipoServicio TipoServicio) {
		return false;
	}

}
