package Agenda;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	public int getOption(Agenda agenda) {
		for (int i = 0; i < 100; ++i)  
		       System.out.println(); 
		int op;
		Pessoa pessoa = new Pessoa("--------", "--------", 20);
		System.out.println("=-=-=-Menu-=-=-=");
		System.out.println("");
		System.out.println("1: Adiciona Pessoa \n2: Imprime todos os contatos \n3: Excluir Contato \n0 Encerrar Programa.\n");
		System.out.printf("Digite sua ação: ");
		op = sc.nextInt();
		
		switch (op) {
			case 1:
				agenda.addPessoa();
				sc.nextLine(); 
				sc.nextLine();
				break;
			case 2:
				System.out.println(agenda.toString());
				pessoa.setTelefone("0");
				sc.nextLine();
				sc.nextLine();
				break;
			case 3:
				pessoa.setTelefone("2");
				agenda.delPessoa();
				sc.nextLine();
				sc.nextLine();
				break;
		}
		return op;
	}
}
