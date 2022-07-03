package Agenda;
import java.util.Scanner;

public class Agenda {
	Scanner sc = new Scanner(System.in);
	private int Q = 0;
	private Pessoa lista[];
	

	public Agenda() {
		this.lista = new Pessoa[10];
	}
	
	public Agenda(int Tam) {
		this.lista = new Pessoa[Tam];
	}
	
	public void addPessoa() {
		Pessoa p = new Pessoa();
		System.out.printf("\nDigite o nome: ");
		p.setNome(sc.next());
		System.out.printf("Digite a idade: ");
		p.setIdade(sc.nextInt());
		System.out.printf("Digite o telefone: ");
		p.setTelefone(sc.next());
		for (int i = 0; i <= lista.length-1; i++) {
			if (lista[i] != null)
				Q++;
		}
		if (Q == 10) {
			System.out.println("\nLista Cheia");
		}
		else {
			for (int i = 0; i <= lista.length-1; i++) {
				if (lista[i] == null) {
					lista[i] = p;
					break;
				}
			}
			System.out.println("Contato Adicionado!");
		}
		Q = 0;
	}
	
	@SuppressWarnings("resource")
	public void delPessoa() {
		String p;
		System.out.printf("\nApagar contato!");
		System.out.printf("\nDigite o nome: ");
		p = sc.next();
		int op;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= lista.length-1; i++) {
			if (lista[i] != null) {
				if (lista[i].getNome().equals(p)) {
					System.out.println("\nDigite 1 para sim;\nDigite 0 para não;");
					System.out.println("\nNome: " + lista[i].getNome() + "\nIdade: " + lista[i].getIdade() + "\nTelefone: " + lista[i].getTelefone() + "\n");
					op = sc.nextInt();
					if (op == 1) {
						lista[i] = null;
						System.out.println("Contato Apagado!");
					}
						
				}
			}
		}
	}

	public Pessoa[] getLista() {
		return lista;
	}

	public void setLista(Pessoa[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		String string = "";
		for (int i = 0; i < lista.length; i++) {
			if (this.lista[i] != null)
				string = string + "\nNome: " + lista[i].getNome() + "\nIdade: " + lista[i].getIdade() + "\nTelefone: " + lista[i].getTelefone() + "\n";
		}
		return string;
	}
	
	
	
}
