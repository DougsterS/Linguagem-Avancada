package br.cc.unipe.aula08.atividade;

import java.util.LinkedList;
import java.util.List;

public class Queue <$>{
	
	private List<$> queue = new LinkedList<$>();
	
	public void insert($ variable) {
		this.queue.add(variable);
	}
	
	public $ remove(){
		return this.queue.remove(0);
	}
	
	public void empty() {
		if(this.queue.size() == 0) {
			System.out.println("This Queue is empty by now");
		} else{
			System.out.println("This Queue is not empty, try to list the elements");
		}
	}
	
	public void listNames() {
		for($ x : this.queue)
			System.out.println(x);
	}

}
