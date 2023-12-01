package entity;

public class Cuadrado extends Figura {
	private static final long serialVersionUID = 1L;
	
	private int lado;
	
	public Cuadrado() {
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}
	
	@Override
	public int area() {
		int area=this.lado * this.lado;
		return area;
	}
}
