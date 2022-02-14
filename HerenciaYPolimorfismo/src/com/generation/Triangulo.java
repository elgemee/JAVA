package com.generation;

public class Triangulo extends FiguraGeometrica {

	public Triangulo () {
		super("Triangulo");
	}
	
	@Override //metodo que le aplicaremos polimorfismo
	public float calcularArea () {
		return (getAlto()* getLargo()) /2;
}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
