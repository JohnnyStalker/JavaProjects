package Veiculo;

public class Pneus {
	double pressure;
	
	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "\nPressão dos Pneus: " + pressure;
	}

	
}
