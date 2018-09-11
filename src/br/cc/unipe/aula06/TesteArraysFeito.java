package br.cc.unipe.aula06;

import java.util.Arrays;

public class TesteArraysFeito {
	
	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		//preenche
		Arrays.fill(a, 10);
		
		//Copia
		int[] copia = Arrays.copyOfRange(a, 0, 10);
		
		System.out.println("Array: " + Arrays.toString(a));
		
		System.out.println("Cópia: " + Arrays.toString(copia));

	}
}
