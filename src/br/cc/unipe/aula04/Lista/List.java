package br.cc.unipe.aula04.Lista;

public interface List <Generic>/*declaracao de tipo generico*/ {
	
	public void add(Generic x);
	
	public Generic remove(int pos);
	
	public int range();
	
	public Generic [] listItall();

}
