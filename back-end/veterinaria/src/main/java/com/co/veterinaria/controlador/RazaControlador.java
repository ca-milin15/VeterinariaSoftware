package com.co.veterinaria.controlador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.co.veterinaria.modelo.Raza;

@RestController
@RequestMapping("/raza")
public class RazaControlador {
	
	@Autowired
	public com.co.veterinaria.servicio.IRaza Raza;
	
	//localhost:8080/softwareVeterinaria/raza/listar  Method: GET
	@GetMapping("listar")
	public List<Raza> ListarRaza()
	{
		List<Raza> listaRaza = Raza.ListarRaza();
		return listaRaza;
	}
	
	//localhost:8080/softwareVeterinaria/raza/guardar Method: POST
	@PostMapping("guardar")
	public boolean guardarRaza(@RequestBody Raza Raza){
		
		return false;
	}

	//localhost:8080/softwareVeterinaria/raza/actualizar Method: PUT
	@PostMapping("actualizar")
	public boolean actualizarRaza(@RequestBody Raza Raza){
		
		return false;
	}
	
	//localhost:8080/softwareVeterinaria/raza/eliminar Method: DELETE
	@DeleteMapping("eliminar")
	public boolean eliminarRaza(@RequestBody Raza Raza) {
		return false;
	}

}
