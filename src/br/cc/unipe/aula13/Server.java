package br.cc.unipe.aula13;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface{//Todo servidor deve ter construtor
	
	private static final long serialVersionUID = 1L;

	public Server() throws RemoteException{
		super();
	}
	
	public String helloName(String name){
		return("Valar Dohaerys, " + name);
	}
	
	public static void main(String[] args) {
		try {
			Server servidor = new Server();
			Naming.rebind("/Westeros", servidor);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
