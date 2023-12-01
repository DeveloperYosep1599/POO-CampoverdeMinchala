package entity;

public class Programador extends Empleado {
	private static final long serialVersionUID = 1L;
	private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
        super(nombre, apellido, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nLineas de Codigo por Hora " + this.lineasDeCodigoPorHora
                + "\nLenguaje Dominante " + this.lenguajeDominante;
    }
}
