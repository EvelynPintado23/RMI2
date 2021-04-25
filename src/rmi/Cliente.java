package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Cliente extends UnicastRemoteObject implements ClienteInterface, Runnable {

	private ServerInterface chatServer;
	private String name = null; 
	
	protected Cliente(String name, ServerInterface chatServer) throws RemoteException{
		this.name = name;
		this.chatServer = chatServer;
		chatServer.registrarCliente(this);
	}
	
	public void recibirMensaje(String mensaje) throws RemoteException {
		System.out.println(mensaje);
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		String mensaje;
		while(true) {
			mensaje = scanner.nextLine();
			try {
				chatServer.broadcastMensaje(name + " : "+ mensaje);
			}catch(RemoteException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	
}
