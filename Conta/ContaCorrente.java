package Conta;

public class ContaCorrente extends Conta{
	private float limite;

	public ContaCorrente(int num, float saldo, Pessoa dono, float limite) {
		super(num, saldo, dono);
		this.limite = limite;
	}
	
	public ContaCorrente() {
		super();
		this.limite = 0;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void imprimir() {
		System.out.println(toString() + "\nLimite: " + limite);
	}
}
