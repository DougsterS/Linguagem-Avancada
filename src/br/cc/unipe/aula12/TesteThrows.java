package br.cc.unipe.aula12;

import java.util.Scanner;


public class TesteThrows {
    
    public static int divisao(int dividendo, int divisor) throws ArithmeticException{
        if (divisor == 0)
            throw new ArithmeticException("Infelizmente você tentou efetuar uma divisão por zero!");
        System.out.println(dividendo/divisor);
        return dividendo/divisor;
    }
    
    public static void main(String[] args) {
        int divi1 = 0;
        int divi2 = 0;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dividendo:");
        divi1 = leitor.nextInt();
        System.out.println("Divisor:");
        divi2 = leitor.nextInt();
        divisao(divi1,divi2);
    }
    
}
