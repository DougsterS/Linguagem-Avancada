package br.cc.unipe.aula13;

import java.rmi.Remote;

public interface MyInterface extends Remote {
	
	public String helloName(String name);

}
