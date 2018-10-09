package br.cc.unipe.aula11.pacotes.banco;

public class Conta {
	
	private int numero;
	private Float agencia;
	private Float saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Float getAgencia() {
		return agencia;
	}
	public void setAgencia(Float agencia) {
		this.agencia = agencia;
	}
	public Float getSaldo() {
		return saldo;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Float deposito){
		this.saldo = saldo + deposito;
	}
	
}
