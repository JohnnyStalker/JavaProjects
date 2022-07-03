package Agenda;

public class Main {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		int op;
		Menu menu = new Menu();
		
		do {
			op = menu.getOption(agenda); 
		} while(op != 0);
	}	
}
