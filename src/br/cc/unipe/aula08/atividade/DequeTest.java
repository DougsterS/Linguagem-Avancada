package br.cc.unipe.aula08.atividade;

public class DequeTest {
	
	public static void main(String[] args) {
		
		Deque deque = new Deque();
		
		deque.empty();
		
		deque.insertFirst("Karol");
		deque.insertFirst(25);
		deque.insertFirst("Hello");
		
		System.out.println("\nFirst Deque:");
		deque.examine();
		
		deque.removeFirst();
		deque.insertLast("Hi!");
		
		System.out.println("\nSecond Deque:");
		deque.examine();
		
		deque.removeLast();
		deque.insertFirst("Hello");
		deque.insertLast("Bye");
		
		System.out.println("\nThird Deque:");
		deque.examine();
		
		System.out.print("\n");
		deque.empty();
		
	}

}
