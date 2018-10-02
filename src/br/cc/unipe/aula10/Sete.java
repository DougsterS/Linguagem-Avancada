package br.cc.unipe.aula10;

import java.util.LinkedList;
import java.util.List;

public class Sete <$>{
	
	private List<$> seti = new LinkedList<$>();
	
	public boolean insert($ variable) {
		if(this.seti.size() == 0){
			this.seti.add(variable);
		} else{
			for($ y : this.seti){
				if(variable.equals(y))
					return false;
			}
			this.seti.add(variable);
		}
		return true;
	}
	
	public void listNames() {
		for($ x : this.seti)
			System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		Sete<String> seite = new Sete<String>();
		
		seite.insert("Douglas");
		seite.insert("Karol");
		seite.insert("Douglas");
		seite.insert("Ian");
		seite.insert("Karol");
		seite.insert("Heitor");
		seite.listNames();
		
	}

}