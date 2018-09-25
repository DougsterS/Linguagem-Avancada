package br.cc.unipe.aula08.atividade;

public class QueueTest {
	
	public static void main(String[] args) {
		
		Queue fila = new Queue();
		
		
		fila.empty();
		
		System.out.print("\n\n");
		
		fila.insert("Douglas");
		fila.insert(12);
		fila.insert("Tchau");
		
		System.out.println("First Queue:");
		fila.listNames();
		
		fila.remove();
		
		System.out.println("\n\nSecond Queue:");
		fila.listNames();
		
		fila.remove();
		fila.insert("Mais um item");
		
		System.out.println("\n\nThird Queue:");
		fila.listNames();
		
		System.out.print("\n\n");
		
		fila.empty();
	}

}
