package entities;


public class Escalacao{
	private String imprimir;
	private String data;
	
	public Escalacao() {
		this.imprimir = "Escalação:";
	
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Escalacao(String imprimir) {
		super();

		this.imprimir = imprimir;
	}

	public String getImprimir(Jogador jogadores) {
		return imprimir;
	}

	public void setImprimir(String jogadores) {
		this.imprimir = jogadores;
		
	}
	

}
