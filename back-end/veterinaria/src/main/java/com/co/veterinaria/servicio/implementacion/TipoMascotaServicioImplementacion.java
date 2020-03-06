package com.co.veterinaria.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public List<TipoMascota> listarTipoMascota() {
		List<TipoMascota> list = tipoMascotaDao.findAll();
		System.out.println(list);
		return list;
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
