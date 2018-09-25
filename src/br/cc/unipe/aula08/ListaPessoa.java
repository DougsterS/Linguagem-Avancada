package br.cc.unipe.aula08;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoa<$> {
	
	private List<$> names;
	
	public ListaPessoa(){
		this.names = new ArrayList<$>();
	}
	
	public void addNames($ name){
		this.names.add(name);
	}
	
	public void listNames(){
		for($ s : this.names)//Para cada nome preenche em s
			System.out.println(s);
	}
	
	public int qntNames(){
		return this.names.size();
	}
	
	public $ getName(int position){
		return this.names.get(position);
	}
	
	public static void main(String[] args) {
		
		ListaPessoa<Person> lista = new ListaPessoa<Person>();
		Person p = new Person("Doug","123456",12);
		
	}
	
}
