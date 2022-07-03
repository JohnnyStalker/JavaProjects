package Conta;

public class Conta {
	private int num;
	private float saldo;
	private Pessoa dono;
	
	public Conta(int num, float saldo, Pessoa dono) {
		super();
		this.num = num;
		this.saldo = saldo;
		this.dono = dono;
	}

	public Conta() {
		super();
		this.num = 0;
		this.saldo = 0;
		this.dono = new Pessoa();
	}
	
	public void imprimir() {
		toString();	
	}

	@Override
	public String toString() {
		return "\n=-=Conta=-=\n\nNum: " + num + "\nSaldo: " + saldo + "\n\nDono" + dono.toString();
	}
	
	
}
