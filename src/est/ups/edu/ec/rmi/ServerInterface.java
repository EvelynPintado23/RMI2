package est.ups.edu.ec.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote {
	
	void registrarCliente(ClienteInterface chatCliente) throws RemoteException;
	void broadcastMensaje(String mensaje) throws RemoteException;


}
