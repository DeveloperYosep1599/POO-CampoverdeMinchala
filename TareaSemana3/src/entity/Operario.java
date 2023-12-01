package entity;

public class Operario extends Empleado {
	private static final long serialVersionUID = 1L;

	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " --> Operario";
	}
}