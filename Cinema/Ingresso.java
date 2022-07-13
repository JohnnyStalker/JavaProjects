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
	
	public String getData() {
		return data;
	}

	public String getNome() {
		return nome;
	}

	public String getSala() {
		return sala;
	}

	public String getHora() {
		return hora;
	}

	public double imprimeValor(){
		return getValor();
	}
	
}
