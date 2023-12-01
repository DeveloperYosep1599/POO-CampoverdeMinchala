package test;

import entity.Empleado;
import entity.Programador;

public class Test {
	public static void main(String[] args) {
		Empleado emp = new Empleado("Jose", "Campoverde", "0302514351", 23, true, 500);
		System.out.println(emp);
		emp.mostrarClasificacion(23);
		emp.aumentarSalario(22);

		System.out.println("----------------------------------");
		Programador prog = new Programador(500, "Java", "Ismael", "Minchala", "0302514351", 28, false, 1500);
		System.out.println(prog);
	}
}
