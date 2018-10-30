package br.cc.unipe.aula13.atividade;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

import br.cc.unipe.aula04.Lista.List;
import br.cc.unipe.aula13.Server;

public class ServerAgenda<$> extends UnicastRemoteObject implements InterfaceAgenda{
	
	protected ServerAgenda() throws RemoteException {
		super();
	}
	
	private LinkedList<$> listaNomes = new LinkedList<$>();

	private static final long serialVersionUID = 1L;

	public String Nome(String nome) throws RemoteException {
		return nome;
	}

	public String Numero(String numero) throws RemoteException {
		return numero;
	}
	
	public static void main(String[] args) {
		try {
			System.out.print("Servidor iniciado");
			Server servidor = new Server();
			Naming.rebind("/Agenda", servidor);
			System.out.print("Agenda Boladona!!");
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
		}
	}

}
