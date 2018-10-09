package br.cc.unipe.aula11.pacotes.testes;

import java.util.Scanner;
import br.cc.unipe.aula11.pacotes.banco.Conta;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Conta conta = new Conta();
		Float deposito;	
		
		conta.setSaldo((float) 190.0);
		System.out.println("R$ "  + conta.getSaldo());
		System.out.println("Quer depositar quanto?");
		deposito = leitor.nextFloat();
		conta.depositar(deposito);
		System.out.println("R$ " + conta.getSaldo());
				
	}
}