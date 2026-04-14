package main;

import model.Cliente;
import model.Frete;
import model.Utilitario;

public class Transportadora {

	
	
	public static void main(String arg[]) {
		
		Utilitario u = new Utilitario();
		u.setCodigo("456");
		u.setPlaca("ABC9875");
		
		
		Utilitario u2 = new Utilitario();
		u2.setCodigo("456","UTC");
		u2.setPlaca("ABC9875");
		
		
		
		Cliente c1 = new Cliente();
		c1.setNome("Fulano de tal");
		
		Frete f1 = new Frete();
		f1.setVeiculo(u2);
		f1.setCliente(c1);
		
		System.out.println("Frete para: " + f1.getCliente().getNome());
	    System.out.println("Veículo: " + f1.getVeiculo().getCodigo());
		
	}
	
	
	
	
	
	
	
}
