package Cinema;

public class Platinum extends Ingresso {
	private static final double DESCONTO = 0.88;
	
	public Platinum(String data, String nome, String sala, String hora, double valor) {
		super(data, nome, sala, hora, valor);
	}
	
	@Override
	public double imprimeValor(){
		return getValor() * DESCONTO;
	}
}
