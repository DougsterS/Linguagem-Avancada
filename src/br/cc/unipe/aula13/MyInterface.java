package br.cc.unipe.aula13;

import java.rmi.Remote;
import java.rmi.RemoteException; 

public interface MyInterface extends Remote {
	
	public String helloName(String name) throws RemoteException;

}