package com.generation;

public class Cuadrado extends FiguraGeometrica {//heredar-extends
//cuadrado clase hija
	
	public Cuadrado () {
		super("Cuadrado"); //llamar constructor padre 
		
	}
	@Override
	public float calcularArea() {
		return getAlto()*getLargo();
	}
	@Override
	public float perimetro() {
		return (getAlto() + getLargo())*2;
	}
}
