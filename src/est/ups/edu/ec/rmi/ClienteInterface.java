package est.ups.edu.ec.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClienteInterface extends Remote {
	
	void recibirMensaje(String mensaje) throws RemoteException;

}
