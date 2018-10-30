package br.cc.unipe.aula13;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Client {
	
	public static void main(String[] args) {
		try {
			System.out.Println("Cliente Iniciado");
			Remote obj = Naming.lookup("//127.0.0.1/Westeros");
			System.out.Println("The winter had come in //127.0.0.1/Westeros");
			MyInterface objRemoto = (MyInterface)obj;
			String retornar = objRemoto.helloName("Douglas");
			System.out.Println(retornar);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
