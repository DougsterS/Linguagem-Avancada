package br.cc.unipe.aula06;

public class TesteArray {

	public static void main(String[] args) {
		//Alterar este c�digo utilizando Arrays(m�todo de preenchimento, ordena��o e c�pia)
		int[] a = new int[10];
		int[] copia = new int[10];
		int pos = 0;
		
		//preenche
		for(pos = 0; pos < 10; pos++)
			a[pos] = pos;
		
		//copia
		for(pos = 0; pos<10; pos++)
			copia[pos] = a[pos];
		
		for(int i:a)
			System.out.println("Array: " + i);
		
		for(int i: copia)
			System.out.println("Copia: " +i);
	}
}
