package Veiculo;

public class Veiculo {
	private Motor motor = new Motor();
	private Pneus pneus = new Pneus();
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Pneus getPneus() {
		return pneus;
	}
	public void setPneus(Pneus pneus) {
		this.pneus = pneus;
	}
	
	public void abastecer(double gas) {
		motor.getTanque().setQuant(gas);
	}
	
	private void calculo(double aux, double km) {
		if (aux <= motor.getTanque().getQuant()) {
			motor.getTanque().setQuant(motor.getTanque().getQuant() - aux);
			System.out.println("\nO carro andou " + aux + "km, e possui " + motor.getTanque().getQuant() + "de combustivel no tanque");
		}
		else {
			double aux2 = motor.getTanque().getQuant()*aux;
			System.out.println("Cabou a gasosa mo fi, mas tu rodou " + aux2 + " quilometros ainda");
		}
	}
	
	public void go(double km) {
		if (pneus.getPressure() >= 20) {
			double aux = km / motor.getGasUse();
			calculo(aux, km);
		}
		else {
			double aux = motor.getGasUse()*1.3;
			calculo(aux, km);
		}
	}
	
	@Override
	public String toString() {
		String string = "";
		string += motor;
		string += pneus;
		return string;
	}
	
	
}
