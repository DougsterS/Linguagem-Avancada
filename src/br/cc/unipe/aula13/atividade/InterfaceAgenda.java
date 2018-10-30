package br.cc.unipe.aula13.atividade;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.cc.unipe.aula04.Lista.List;

public interface InterfaceAgenda<$> extends Remote{
	
	public String Nome(String nome) throws RemoteException;
	public String Numero(String numero) throws RemoteException;

}
