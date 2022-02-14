package com.generation;

public class Main {

	public static void main(String[] args) {

		//Herencia: Cuando una clase hereda de otra, esta tiene acceso
		//a sus atributos y métodos
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setAlto(10);
		cuadrado1.setlargo(10);
		System.out.println("El area del "+ cuadrado1.getNombre() + " es "
							+ cuadrado1.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(10);
		triangulo1.setlargo(15);
		System.out.println("El area del "+ triangulo1.getNombre() + " es "
				+ triangulo1.calcularArea());

	}

}
