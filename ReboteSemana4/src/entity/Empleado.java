package entity;

import java.io.Serializable;

public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nombre, apellido;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;

	public Empleado() {
	}

	public Empleado(String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
		if (edad >= 18 || edad <= 45) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.cedula = cedula;
			this.edad = edad;
			this.casado = casado;
			this.salario = salario;
		} else {
			System.out.println("Error la edad debe estar entre el rango de 18 y 45 años");
		}
	}

	public void mostrarClasificacion(int edad) {
		if (edad <= 21) {
			System.out.println("Clasificacion: Principiante");
		} else if (edad >= 22 || edad <= 35) {
			System.out.println("Clasificacion: Intermedio");
		} else if (edad > 35) {
			System.out.println("Clasificacion: Senior");
		}
	}

	public void aumentarSalario(double porcentaje) {
		double calculo = (porcentaje / 100) + 1;
		double nuevoSalario = this.salario * calculo;
		this.salario = nuevoSalario;
		System.out.println("Nuevo Salario: " + this.salario);
	}

	@Override
	public String toString() {
		return "Datos del Empleado" + "\nnombre=" + nombre + "\napellido=" + apellido + "\ncedula=" + cedula + "\nedad="
				+ edad + "\ncasado=" + casado + "\nsalario=" + salario;
	}
}
