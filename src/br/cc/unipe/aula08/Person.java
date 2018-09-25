package br.cc.unipe.aula08;

public class Person {
	
	public Person(String name, String cpf, int age){
		this.name = name;
		this.age = age;
		this.cpf = cpf;
	}
	
	private int age;
	private String cpf;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
