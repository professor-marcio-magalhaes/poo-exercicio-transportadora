package model;

public class Veiculo {

    public Veiculo(String codigo, String placa) {
		//super();
		this.codigo = codigo;
		this.placa = placa;
	}

	private String codigo;
    private String placa;
	
    public Veiculo() {
    	
    }
    
    public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String cod) {
		this.codigo = cod;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return "Veiculo [cod =" + codigo + "]" + "[placa = "+placa+"]";
	}
	
	
	
	
	
}
