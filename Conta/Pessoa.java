package Conta;

public class Pessoa {
	private String nome;
	private int ID;
	
	public Pessoa() {
		super();
		this.nome = "John Doe";
		this.ID = 0;
	}
	
	public Pessoa(String nome, int ID) {
		super();
		this.nome = nome;
		this.ID = ID;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nID: "+ ID;
	}
	
	
	
}
