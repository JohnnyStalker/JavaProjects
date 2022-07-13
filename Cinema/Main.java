package Cinema;

public class Main {

	public static void main(String[] args) {
		int aux;
		String 	data = "28/07", 
				nome = "Doutor Diferenciado", 
				sala = "08", 
				hora = "19:30";
		double 	valor = 25.50;
		
		Cinema cinema = new Cinema();
		Ingresso comum = new Ingresso(data, nome, sala, hora, valor);
		Ingresso gold = new Gold(data, nome, sala, hora, valor);
		Ingresso platinum = new Platinum(data, nome, sala, hora, valor);
		Cliente cliente = new Cliente("Marcos", 711, "222", 10);
		
		aux = cliente.comprarIngresso();
		switch (aux) {
		case 1:
			System.out.println("Foram debitados " + comum.imprimeValor() + "R$ do cartão de número: " + cliente.getCard());
			break;
		case 2:
			System.out.println("Foram debitados " + gold.imprimeValor() + "R$ do cartão de número: " + cliente.getCard());
			break;
		case 3:
			System.out.println("Foram debitados " + platinum.imprimeValor() + "R$ do cartão de número: " + cliente.getCard());
			break;
		}
		
		cinema.addCliente(cliente);
		cinema.addCliente(cliente);
		cinema.addCliente(new Cliente("Marcos", 712, "222", 10));
		cinema.imprimirClientes();
		cinema.removerCliente(cliente);
	}
}
