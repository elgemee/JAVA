package com.generation.animales;

public class Gato extends Animal implements Mascota{

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy jugando con cajas");
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Estoy persiguiendo una luz");

	}

	@Override
	public void baniar() {
		// TODO Auto-generated method stub
		System.out.println("Me gusta el agua :)");

	}
}
