package com.clearminds.cdpo.dtos;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int numero;
	
	public Estudiante(String nombre, String apellido, int numero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
	}

	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + "]";
	}
	
	
}
