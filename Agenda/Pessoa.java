package Agenda;

public class Pessoa {
	private String nome;
	private String telefone;
	private int idade;
	
	public Pessoa() {
		this.nome = null;
		this.telefone = null;
		this.idade = 0;
	}

	public Pessoa(String nome, String telefone, int idade) {
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return ("Nome:" + nome + "\nIdade: " + idade + "\nTelefone: " + telefone);
	}
	
}