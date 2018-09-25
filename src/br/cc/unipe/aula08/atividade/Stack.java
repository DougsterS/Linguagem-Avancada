package br.cc.unipe.aula08.atividade;

import java.util.LinkedList;
import java.util.List;

public class Stack <$>{
	
	private List<$> xtack = new LinkedList<$>();
	
	public void push($ variable) {
		this.xtack.add(variable);
	}
	
	public $ pop(){
		return this.xtack.remove(this.xtack.size() - 1);
	}
	
	public void empty() {
		if(this.xtack.size() == 0) {
			System.out.println("This Stack is empty by now");
		} else{
			System.out.println("This Stack is not empty, try to list the elements");
		}
	}
	
	public void listItens() {
		for($ b : this.xtack)
			System.out.println(b);
	}

}
