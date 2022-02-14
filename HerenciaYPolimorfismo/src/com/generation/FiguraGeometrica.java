package com.generation;

public abstract class FiguraGeometrica {
	//Clases abstractas
	//La clase abstracta no puede crear objetos
	//clases que pueden o no contener  metodos abstractos
	//Metodo abstracto es un metodo que te dice que hacer pero no te dice como hacerlo
	private String nombre;
	protected float alto;
	protected float largo;
	
//	public FiguraGeometrica() {
//		
//	}

	public FiguraGeometrica (String nombre) {
		this.nombre = nombre;
	}
	
	
		public String  getNombre() {
			return nombre;
		}
		public void  setNombre(String nombre) {
			this.nombre=nombre;
		}
		
		public float  getAlto() {
			return alto;
		}
		public void  setAlto(float alto) {
			this.alto=alto;
		}
		
		public float  getLargo() {
			return largo;
		}
		
		public void  setlargo(float largo) {
			this.largo=largo;
		}
		
		public abstract float calcularArea();
		public abstract float perimetro();
		
}
