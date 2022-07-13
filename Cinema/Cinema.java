package Cinema;

import java.util.ArrayList;

public class Cinema {
	 private ArrayList<Cliente> Clientes;

	public Cinema() {
		super();
		this.Clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return Clientes;
	}
	
	public void addCliente(Cliente cliente) {
		if (Clientes.contains(cliente)) {
			System.out.println("\nCliente já faz parte da lista!");
		}
		else {
			Clientes.add(cliente);
			System.out.println("\nCliente adicionado com sucesso!");
		}
	}
	
	public void removerCliente(Cliente cliente) {
		if (Clientes.contains(cliente)) {
			Clientes.remove(cliente);
			System.out.println("\nCliente removido com sucesso!");
		}
		else {
			System.out.println("\nO Cliente inserido não está cadastrado!");
		}
	}
	
	public void imprimirClientes() {
		Clientes.forEach(cliente -> System.out.println(cliente));
	}
}
