package paquete2;

//import paquete1.ClaseDefault;
import paquete1.*;
public class Main extends paquete1.ClaseProtected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClaseDefault prueba = new ClaseDefault();
		
	//	prueba.mostrar();
		
		//ClasePrivada privada = new ClasePrivada();
		//privada.edad = 30;
		//privada.nombre = "Alexis";
		//privada.setSaludar("Alexis");
		
	//	System.out.println(privada.getSaludar());
	//	System.out.println(privada.nombre);

		//Objeto de la clase Protected
		 
		
	Main protegido = new Main();
	
		protegido.setEdad (18);
		System.out.println(protegido.getEdad());
	}

}
