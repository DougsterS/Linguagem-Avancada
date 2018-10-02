package br.cc.unipe.aula09;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pessoa implements Comparable<Pessoa>{
	
	public Pessoa(String name, String cpf, int age){
		this.name = name;
		this.age = age;
		this.cpf = cpf;
	}
	
	private int age;
	private String cpf;
	private String name;
	
	public String getCPF(){
		return this.cpf;
	}
	
	public 	int getAge(){
		return this.age;
	}
	
	public int hashCode(){//Sobrescreve-se HashCode
		return this.getCPF().hashCode();
	}
	
	public boolean equals(Object o){//OBS: HashSet não usa equals, mas sim HashCode. O equals é utilizado no TreeSet
		
		Pessoa p = (Pessoa) o;
		
		if(this.getCPF().equals(p.getCPF()))
			return true;
		return false;
		
	}

	public int compareTo(Pessoa m) {
		
		if(this.getAge() == m.getAge())
			return 0;
		
		if(this.getAge() < m.getAge())
			return -1;
		
		else
			return 1;
	}
	
	public static void main(String[] args) {
		
		Set<Pessoa> pressoa = new HashSet<Pessoa>();
		//Set<Pessoa> pressoa = new TreeSet<Pessoa>();//TreeSet utiliza CompareTo e ordena pela variável que utilizamos para comparação
		
		Pessoa p = new Pessoa("Douglas","865784",19);
		Pessoa p2 = new Pessoa("Jailson","865884",34);
		Pessoa p3 = new Pessoa("Carla","865884",37);//CPF's iguais são vistos como a mesma pessoa no HashSet
		
		
		pressoa.add(p);
		pressoa.add(p2);
		pressoa.add(p3);
		
		for(Pessoa xd : pressoa)
			System.out.println(xd.getCPF());
		
		System.out.println("Tamanho: " + pressoa.size());
		
	}


}
