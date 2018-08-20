package br.cc.unipe.aula02;

import java.util.Scanner;
import br.cc.unipe.aula01.Conta;
import br.cc.unipe.aula02.Atributos;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float dindin;
		int opcao = 0;
		String num;
		float operacao;
		String nome;
		
		Conta conta = new Conta();
		Atributos atri = new Atributos();
		
		conta.exibirMensagem();
		
		System.out.println("Informe seu CPF:");
		num = leitor.nextLine();
		atri.setNumero(num);
		
		System.out.println("Informe seu nome:");
		nome = leitor.nextLine();
		atri.setNome(nome);
		
		System.out.println("Por favor, informe seu saldo:");
		dindin = leitor.nextFloat();
		atri.setSaldo(dindin);
		
		System.out.println("CPF:" + atri.getNumero() + " cadastrado ao usuário: " + atri.getNome());
		while(opcao != 3) {
			System.out.println("Saldo: R$" + atri.getSaldo());
			System.out.println("Por favor, indique uma opção a seguir:\n"
					+ "1 - Debitar\n"
					+ "2 - Creditar\n"
					+ "3 - Sair\n");
			opcao = leitor.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite quanto deseja sacar de sua conta:");
				operacao = leitor.nextFloat();
				atri.saqueDinheiro(operacao);
			}
			
			if(opcao == 2) {
				System.out.println("Digite quanto você deseja Creditar em sua conta:");
				operacao = leitor.nextFloat();
				atri.depositaDinheiro(operacao);
			}
			
			System.out.println(atri.getNome() + " seu saldo é R$" + atri.getSaldo());
		}
		
		System.out.println("Obrigado por utilizar nossos serviços");
	}

}