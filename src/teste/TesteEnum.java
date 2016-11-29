package teste;

import enums.Logica;
import enums.Luz;

public class TesteEnum {

	public static void main(String[] args) {
		System.out.println(Luz.DESLIGADO);
		System.out.println(Luz.LIGADO);
		
		System.out.println(Logica.FALSE);
		System.out.println(Logica.TRUE);
		Logica logica = Logica.TRUE;
		if(logica.equals(Logica.TRUE)) {
			System.out.println("Assim funciona");
		}
		if(logica.equals("TRUE")) {
			System.out.println("Assim também funciona");
		}
		if(logica == Logica.TRUE) {
			System.out.println("Assim também funciona funciona 2");
		}
		
	}
	
}
