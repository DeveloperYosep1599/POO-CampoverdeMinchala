package entity;

public class Triangulo extends Figura {
	private static final long serialVersionUID = 1L;
	private int base;
	private int altura;

	public Triangulo() {
	}

	public Triangulo(int base, int altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public int area() {
		int area=this.base * this.altura;
		return area;
	}
}
