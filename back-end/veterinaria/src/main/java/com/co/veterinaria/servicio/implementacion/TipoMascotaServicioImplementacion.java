package com.co.veterinaria.servicio.implementacion;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.veterinaria.compartidos.dto.TipoMascotaDto;
import com.co.veterinaria.modelo.TipoMascota;
import com.co.veterinaria.modelo.dao.TipoMascotaDAO;
import com.co.veterinaria.servicio.ITipoMascota;

@Service
public class TipoMascotaServicioImplementacion implements ITipoMascota{

	@Autowired
	public TipoMascotaDAO tipoMascotaDao;
	
	/* (non-Javadoc)
	 * @see com.co.veterinaria.servicio.TipoMascota#listarTipoMascota()
	 */
	@Override
	public List<TipoMascotaDto> listarTipoMascota() {
		return generarListaTipoMascotaDtoDesdeEntidad(tipoMascotaDao.findAll());
	}

	/**
	 * @author Camilo Rivera 
	 * @date 07-mar.-2020 14:35:08
	 * @param listaMascota
	 * @return
	 */
	private List<TipoMascotaDto> generarListaTipoMascotaDtoDesdeEntidad(List<TipoMascota> listaMascota) {
		return listaMascota.stream().map(tipoMascota -> {
			
			return new TipoMascotaDto(tipoMascota);
		}).collect(Collectors.toList());
	}

	/* (non-Javadoc)
	 * @see com.co.veterinaria.servicio.TipoMascota#guardarTipoMascota()
	 */
	@Override
	public Boolean guardarTipoMascota() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.co.veterinaria.servicio.TipoMascota#eliminarTipoMascota()
	 */
	@Override
	public Boolean eliminarTipoMascota() {
		// TODO Auto-generated method stub
		return null;
	}

}
