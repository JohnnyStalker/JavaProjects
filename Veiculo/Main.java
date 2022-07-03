package Veiculo;

public class Main {
	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		
		carro.getMotor().setHp(71);
		carro.getMotor().setGasUse(12);
		carro.getMotor().getTanque().setFull(50);
		carro.getPneus().setPressure(19);
		
		carro.abastecer(30);
		System.out.println(carro);
		carro.go(4);
		System.out.println(carro);
		
	}	
}
