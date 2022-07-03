package Conta;

public class ContaPoupanca extends Conta {
	private float taxa;
	
	public ContaPoupanca(int num, float saldo, Pessoa dono, float taxa) {
		super(num, saldo, dono);
		this.taxa = taxa;
	}
	
	public ContaPoupanca() {
		super();
		this.taxa = 0;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	public void imprimir() {
		System.out.println(toString() + "\nTaxa: " + taxa);
	}
	
}
