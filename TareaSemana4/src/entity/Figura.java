package entity;

import java.io.Serializable;

public class Figura implements Serializable {
	private static final long serialVersionUID = 1L;
	private String color;

	public Figura() {
	}

	public Figura(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public int area() {
		return 0;
	}
}
