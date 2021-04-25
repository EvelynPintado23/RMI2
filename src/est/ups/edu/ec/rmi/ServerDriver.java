package est.ups.edu.ec.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerDriver {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		Naming.rebind("RmiChatServidor", new Server());
	}

}
