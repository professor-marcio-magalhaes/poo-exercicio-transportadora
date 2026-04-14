package model;

public class Frete {
	 	
	   private Cliente cliente; //Associação
	   private Veiculo veiculo; //Associação
	   private double valor;
	   public void setCliente(Cliente c){
	   	this.cliente = c;
	   }
	   public void setVeiculo(Veiculo v){
	   	this.veiculo = v;
	   }
	   public Cliente getCliente(){
			return cliente;
		}
	   public Veiculo getVeiculo(){
	   	return veiculo;
	   }

}
