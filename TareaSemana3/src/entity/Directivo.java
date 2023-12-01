package entity;

public class Directivo extends Empleado {
	private static final long serialVersionUID = 1L;

	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " --> Directivo";
	}

}
