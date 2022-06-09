package Arraylist;

public class Main {
	public static void main(String[] args) {
		GerenteCarros gerente = new GerenteCarros();
		gerente.adicionarCarro(new Carro("Buggati", "Preta", 2021, new Pessoa("Musquito", 21)));
		gerente.adicionarCarro(new Carro("Camaro", "Verde", 2022, new Pessoa("Chiquin", 22)));
		gerente.adicionarCarro(new Carro("Citroen", "Roxo", 2025, new Pessoa("Esqueleto", 21)));
		gerente.imprimirTodosCarros();
		System.out.println("=-=-=-=-=-=-=-");
		gerente.removerCarro(21);
		gerente.adicionarCarro(new Carro("Citroen", "Roxo", 2025, new Pessoa("Esqueleto", 21)));
		gerente.imprimirTodosCarros();
	}
}
