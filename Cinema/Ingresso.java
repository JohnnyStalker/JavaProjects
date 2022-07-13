package Cinema;

public class Ingresso {
	private String data;
	private String nome;
	private String sala;
	private String hora;
	private double valor;
	
	public Ingresso(String data, String nome, String sala, String hora, double valor) {
		super();
		this.data = data;
		this.nome = nome;
		this.sala = sala;
		this.hora = hora;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}



	public double imprimeValor(){
		return getValor();
	}
	
}
