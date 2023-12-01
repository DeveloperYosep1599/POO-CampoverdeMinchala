package entity;

import java.io.Serializable;

public class Empleado  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nombre;

	public Empleado() {
	}

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado: " + nombre;
	}
}
