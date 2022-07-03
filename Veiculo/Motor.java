package Veiculo;

public class Motor {
	double hp;
	double gasUse;
	Tanque tanque = new Tanque();
	
	
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getGasUse() {
		return gasUse;
	}
	public void setGasUse(double gasUse) {
		this.gasUse = gasUse;
	}
	public Tanque getTanque() {
		return tanque;
	}
	public void setTanque(Tanque tanque) {
		this.tanque = tanque;
	}
	
	@Override
	public String toString() {
		return "\nPotência do motor: " + hp + "\nConsumo de gasolina: " + gasUse + tanque;
	}
	
	
}
