package model;

public class Utilitario extends Veiculo{

	public void setCodigo(String cod) {
		super.setCodigo("UTL-"+cod);
	}
	
	public void setCodigo(String cod, String prefixo) {
		super.setCodigo(prefixo+"-"+cod);
	}


}
