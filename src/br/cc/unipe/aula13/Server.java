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
	
	public String helloName(String name)throws RemoteException{
		return("Valar Dohaerys, " + name);
	}
	
	public static void main(String[] args) {
		try {
			System.out.Println("Servidor iniciado");
			Server servidor = new Server();
			Naming.rebind("/Westeros", servidor);
			System.out.Println("The Winter is Coming");
			} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}