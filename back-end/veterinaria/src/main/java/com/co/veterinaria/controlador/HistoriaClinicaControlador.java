package com.co.veterinaria.controlador;
import java.util.List;
import com.co.veterinaria.modelo.HistoriaClinica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historiaclinica")
public class HistoriaClinicaControlador {
	
	@Autowired
	public com.co.veterinaria.servicio.IHistoriaClinica HistoriaClinica;
	
	//localhost:8080/softwareVeterinaria/historiaclinica/listar  Method: GET
		@GetMapping("listar")
		public List<HistoriaClinica> ListarHistoriaClinica()
		{
			List<HistoriaClinica> listaHistoriaClinica = HistoriaClinica.listarHistoriaClinica();
			return listaHistoriaClinica;
		}
		
		//localhost:8080/softwareVeterinaria/historiaclinica/guardar Method: POST
		@PostMapping("guardar")
		public boolean guardarHistoriaClinica(@RequestBody HistoriaClinica HistoriaClinica){
			
			return false;
		}

		//localhost:8080/softwareVeterinaria/historiaclinica/actualizar Method: PUT
		@PostMapping("actualizar")
		public boolean actualizarHistoriaClinica(@RequestBody HistoriaClinica HistoriaClinica){
			
			return false;
		}
		
		//localhost:8080/softwareVeterinaria/historiaclinica/eliminar Method: DELETE
		@DeleteMapping("eliminar")
		public boolean eliminarHistoriaClinica(@RequestBody HistoriaClinica HistoriaClinica) {
			return false;
		}

	
	

}
