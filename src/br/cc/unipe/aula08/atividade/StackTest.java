package br.cc.unipe.aula08.atividade;

public class StackTest {
	
	public static void main(String[] args) {
		
		Stack pilha = new Stack();
		
		pilha.empty();
		
		pilha.push("Modric");
		pilha.push(2018);
		pilha.push("Madrid");
		
		System.out.println("\nFirst Stack:");
		pilha.listItens();
		
		pilha.pop();
		
		System.out.println("\nSecond Stack:");
		pilha.listItens();
		
		pilha.push("ItemX");
		
		System.out.println("\nThird Stack:");
		pilha.listItens();
		
		pilha.pop();
		
		System.out.println("\nFourth Stack:");
		pilha.listItens();
		
		System.out.print("\n");
		pilha.empty();
	}

}
