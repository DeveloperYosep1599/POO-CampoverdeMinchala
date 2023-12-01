package test;

import entity.Cuadrado;
import entity.Triangulo;

public class Test {
public static void main(String args[]) {
	Cuadrado figura1=new Cuadrado("Rojo", 5);
	int area=figura1.area();
	System.out.println("El area del cuadrado es: "+area);
	Triangulo figura2=new Triangulo(2, 10, "Azul");
	int area2=figura2.area();
	System.out.println("El area del triangulo es: "+area2);
}
}
