package com.co.veterinaria.modelo;

import javax.persistence.Table;

@Table(name = "Mascota")
public class Mascota extends EntidadGenerica {

	private static final long serialVersionUID = -2189517390580263678L;
	
	public String nombre;
	
	public Integer edad;
	
	public String fechaDeNacimiento;
	
	public Integer historiaClinicaId;
	
	public Integer razaId;
	
	public Integer tipoMascotaId;
	
	public Integer carnetId;
	
	public Double peso;
	
	public Double altura;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Integer getHistoriaClinicaId() {
		return historiaClinicaId;
	}

	public void setHistoriaClinicaId(Integer historiaClinicaId) {
		this.historiaClinicaId = historiaClinicaId;
	}

	public Integer getRazaId() {
		return razaId;
	}

	public void setRazaId(Integer razaId) {
		this.razaId = razaId;
	}

	public Integer getTipoMascotaId() {
		return tipoMascotaId;
	}

	public void setTipoMascotaId(Integer tipoMascotaId) {
		this.tipoMascotaId = tipoMascotaId;
	}

	public Integer getCarnetId() {
		return carnetId;
	}

	public void setCarnetId(Integer carnetId) {
		this.carnetId = carnetId;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
}
