package Conta;

public class Main {

	public static void main(String[] args) {;
		ContaCorrente conta1 = new ContaCorrente(01, 750, new Pessoa("Johnny", 21), 600);
		ContaPoupanca conta2 = new ContaPoupanca(03, 960, new Pessoa("Johanna", 23), 50);
		ContaCorrente Test1 = new ContaCorrente();
		ContaPoupanca Test2 = new ContaPoupanca();
		Test1.imprimir();
		Test2.imprimir();
		conta1.imprimir();
		conta2.imprimir();
	}

}
