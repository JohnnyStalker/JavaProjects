package Veiculo;

public class Tanque {
	double full = 10;
	double quant;
	
	public double getFull() {
		return full;
	}
	public void setFull(double full) {
		this.full = full;
	}
	public double getQuant() {
		return quant;
	}
	public void setQuant(double quant) {
		this.quant = quant;
	}
	@Override
	public String toString() {
		return "\nCapacidade do tanque: " + full + "\nQuantidade do tanque: " + quant;
	}
	
	
}
