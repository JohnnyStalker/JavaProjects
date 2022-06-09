package Arraylist;

public class Pessoa {
	private String nome;
	private int num;
	
	public Pessoa(String nome, int num) {
		super();
		this.nome = nome;
		this.num = num;
	}
	
	public Pessoa() {
		super();
		this.nome = "Jon Doe";
		this.num = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nApartamento: " + num;
	}
	
	
	
}
