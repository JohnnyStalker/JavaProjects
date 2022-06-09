package Arraylist;

public class Carro {
	private String modelo;
	private String cor;
	private int ano;
	private Pessoa dono = new Pessoa();
	
	public Carro() {
		super();
		this.modelo = "Padrão";
		this.cor = "Padrão";
		this.ano = 0;
		this.dono = new Pessoa();
	}
	
	public Carro(String modelo, String cor, int ano, Pessoa dono) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.dono = dono;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Pessoa getDono() {
		return dono;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Modelo: " + modelo + "\nCor: " + cor + "\nAno: " + ano + "\nNome do dono: " + dono.getNome() + "\nApartamento do dono: " + dono.getNum() + "\n";
	}
	
	
	
	
}
