package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server extends UnicastRemoteObject implements ServerInterface{

	private static final long serialVersionUID = 1L;
	private ArrayList<ClienteInterface> chatClientes;
	
	protected Server() throws RemoteException{
		chatClientes = new ArrayList<ClienteInterface>();
	}

	public synchronized void registrarCliente(ClienteInterface chatCliente) 
			throws RemoteException {
		this.chatClientes.add(chatCliente);
	}
		
	public synchronized void broadcastMensaje(String mensaje) throws RemoteException {
		int i = 0;
		while(i< chatClientes.size()) {
			chatClientes.get(i++).recibirMensaje(mensaje);
		}
		
	}


}
	