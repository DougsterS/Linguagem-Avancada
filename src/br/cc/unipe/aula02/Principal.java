package br.cc.unipe.aula02;

import java.util.Scanner;
import br.cc.unipe.aula01.Conta;
import br.cc.unipe.aula02.Atributos;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float dindin;
		String num;
		
		Conta conta = new Conta();
		Atributos atri = new Atributos();
		
		conta.exibirMensagem();
		
		System.out.println("Informe seu CPF:");
		num = leitor.next();
		atri.setNumero(num);
		
		System.out.println("Por favor, informe seu saldo:");
		dindin = leitor.nextFloat();
		atri.setSaldo(dindin);
		
		System.out.println(atri.getNumero() + " seu saldo é R$" + atri.getSaldo());
		
	}

}