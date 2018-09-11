package br.cc.unipe.aula06;

import java.util.Arrays;

public class ArraySort {
	//Aplicação de ArraySort
	public static void main(String[] args) {
		
		int[] desordem = {4,9,1,13,25,69,30,26,19,8,500,2,20};
		
		System.out.println("Desordenado: " + Arrays.toString(desordem));
		//ordena
		Arrays.sort(desordem);
		System.out.println("Ordenado: " + Arrays.toString(desordem));
		
	}

}
