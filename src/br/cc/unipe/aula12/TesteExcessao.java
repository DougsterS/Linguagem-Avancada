package br.cc.unipe.aula12;

import java.util.Scanner;

public class TesteExcessao {
	
	public static void main(String[] args) {
            
		int dividendo = 1;
		int divisor = 0;
                int resultado = 0;
		
                do{
                    try{
                        Scanner leitor = new Scanner(System.in);
                        System.out.println("Dividendo:");
                        dividendo = leitor.nextInt();
                        System.out.println("Divisor");
                        divisor = leitor.nextInt();
                        resultado = dividendo/divisor;
                    } catch(ArithmeticException excessao){
			System.out.println("Deu erro cumpadi!");
                    }
                }while(divisor == 0);
                System.out.println("Resultado: " + resultado);
	}
}