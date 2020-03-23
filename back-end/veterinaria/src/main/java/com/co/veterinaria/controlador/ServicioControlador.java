package com.co.veterinaria.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.co.veterinaria.modelo.Servicio;

@RestController
@RequestMapping("/servicio")
public class ServicioControlador {
	
	@Autowired
	public com.co.veterinaria.servicio.IServicio Servicio;
	
	@GetMapping("listar")
	public List<Servicio> ListarServicio(){
		List<Servicio> listaServicio = Servicio.ListarServicio();
		return listaServicio;
	}
	
	@PostMapping("guardar")
	public boolean guardarServicio(@RequestBody Servicio Servicio) {
		return false;
	}
	
	@PostMapping("actualizar")
	public boolean actualizarServicio(@RequestBody Servicio Servicio) {
		return false;
	}
	
	@DeleteMapping("eliminar")
	public boolean eliminarServicio(@RequestBody Servicio Servicio) {
		return false;
	}

}
