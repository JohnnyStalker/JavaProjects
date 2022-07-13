package Cinema;

import java.util.Objects;
import java.util.Scanner;

public class Cliente {
	Scanner sc = new Scanner(System.in);
	private int op = 0;

	private String nome;
	private int cpf;
	private String card;
	private int ingressosC; //Ingressos Comprados;
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	
	public Cliente(String nome, int cpf, String card, int ingressosC) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.card = card;
		this.ingressosC = ingressosC;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf;
	}
	
	public void comprarIngresso() {
		System.out.println("\nQual ingresso deseja comprar?\n1: Ingresso Comum.\n2: Ingresso Vip Gold.\n3: Ingresso Vip Platinum.\n\nDigite sua opção:");
		op = sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("\nIngresso comum comprado com sucesso!");
			break;
		case 2:
			System.out.println("\nIngresso Vip Gold comprado com sucesso!");
			break;
		case 3:
			System.out.println("\nIngresso Vip Platinum comprado com sucesso!");
			break;
		default:
			System.out.println("\nNão há ingresso com a opção digitada!");
			break;
		}
	}
	
	@Override
	public String toString() {
		return "\n=-=-=Cliente=-=-=\n" + "Nome: " + nome + "\nCPF: " + cpf + "\nIngressos Comprados: " + ingressosC;
	}
	
}
