package est.ups.edu.ec.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClienteDriver {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		String chatServerURL = "rmi://localhost/RMIServer";
		ServerInterface chatServer = (ServerInterface) Naming.lookup(chatServerURL);
		new Thread(new Cliente(args[0], chatServer)).start();

	}

}
