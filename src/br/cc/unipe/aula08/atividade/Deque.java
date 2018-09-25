package br.cc.unipe.aula08.atividade;

import java.util.LinkedList;
import java.util.List;

public class Deque <$>{//Nothing more than a "double-ended-queue"
	
	private List<$> deque = new LinkedList<$>();
	
	public $ removeFirst() {
		return this.deque.remove(0);
	}
	
	public $ removeLast() {
		return this.deque.remove(this.deque.size() - 1);
	}
	
	public void insertLast($ variable){
		this.deque.add(variable);
	}
	
	public void insertFirst($ variable) {
		this.deque.add(0,variable);
	}
	
	public void empty() {
		if(this.deque.size() == 0) {
			System.out.println("This Deque is empty by now");
		} else{
			System.out.println("This Deque is not empty, try to list the elements");
		}
	}

	public void examine() {
		for($ z : this.deque)
			System.out.println(z);
	}
	

}
