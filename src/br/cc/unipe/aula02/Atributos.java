package br.cc.unipe.aula02;

public class Atributos {
	
	private String numero;
	private float saldo;
	private String nome;
	
	public String getNumero() {
		return this.numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float dindin) {
		this.saldo = dindin;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void saqueDinheiro(float sacar) {
		this.saldo = this.saldo - sacar;
	}
	
	public void depositaDinheiro(float depositar) {
		this.saldo = this.saldo + depositar;
	}
	
}
