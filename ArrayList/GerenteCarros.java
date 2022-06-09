package Arraylist;

import java.util.ArrayList;

public class GerenteCarros {
	ArrayList<Carro> listaCarros = new ArrayList<Carro>();

	public GerenteCarros() {
		super();
		this.listaCarros = new ArrayList<Carro>();
	}
	
	public void adicionarCarro(Carro carro){
		if (listaCarros.size() == 0) {
			listaCarros.add(carro);
			System.out.println("\nCarro adicionado a garagem 1!\n");
			return;
		}
		
		else {
			for (int i = 0; i < listaCarros.size(); i++) {
				if (listaCarros.get(i).getDono().getNum() == carro.getDono().getNum()) {
					System.out.println("\nJá existe um carro deste apartamento adicionado a garagem!\n");
					return;
				}
			}
			listaCarros.add(carro);
			System.out.println("\nCarro adicionado a garagem 2!\n");
		}
	}

	public void removerCarro(int num) {
		for (int i = 0; i < listaCarros.size(); i++) {
			if (listaCarros.get(i).getDono().getNum() == num) {
				listaCarros.remove(i);
				System.out.println("\nO carro foi removido da garagem!\n");
				return;
			}
		}
		System.out.println("\nNão há nenhum carro deste apartamendo adicionado a garagem!\n");
	}
	
	public void imprimirTodosCarros() {
		for (int i = 0; i < listaCarros.size(); i++) {
			System.out.println("\nCarro " + (i+1));
			System.out.println(listaCarros.get(i).toString());
		}
	}
}
