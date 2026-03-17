package main;

import model.Caminhao;
import model.Utilitario;

public class Transportadora {

	
	
	public static void main(String arg[]) {
		
		Utilitario u = new Utilitario();
		u.setCodigo("456");
		u.setPlaca("ABC9875");
		System.out.println("Cod. Utilitário = " + u.getCodigo());
		System.out.println("Placa Utilitário = " + u.getPlaca());
		System.out.println();
		
		Utilitario u2 = new Utilitario();
		u2.setCodigo("456","UTC");
		u2.setPlaca("ABC9875");
		System.out.println("Cod. Utilitário = " + u2.getCodigo());
		System.out.println("Placa Utilitário = " + u2.getPlaca());
		
		
	}
	
	
	
	
	
	
	
}
