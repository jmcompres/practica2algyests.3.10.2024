package com.algyests.practica2.problema2;

public class Estudiante {

	int matricula;
	String nombre;
	double indiceAcademico;
	
	public Estudiante(int matricula, String nombre, double indiceAcademico) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.indiceAcademico = indiceAcademico;
	}
	
	public String toString()
	{
		return matricula + "  -  " + nombre + "  -  " + indiceAcademico;
	}

}
