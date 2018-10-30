package br.cc.unipe.aula13;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Client {
	
	public static void main(String[] args) {
		try {
			Remote obj = Naming.lookup("//127.0.0.1/Westeros");
			MyInterface objRemoto = (MyInterface)obj;
			objRemoto.helloName("Douglas");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
