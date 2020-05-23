package test;

import java.rmi.RemoteException;

import ws.BanqueServiceProxy;
import ws.Compte;

public class ClientWS {

	public static void main(String[] args) throws RemoteException {
		
		BanqueServiceProxy stub = new BanqueServiceProxy();
		
		System.out.println(stub.conversationEuroToDh(35));
		
		Compte compte = stub.getCompte(3);
	    System.out.println("Code :" +compte.getCode());
	    System.out.println("Solde :" +compte.getSolde());
	    
	    Compte[] cpt = stub.listComptes();
	    
	    for(Compte cp: cpt) {
	    	
	    	System.out.println("----------------------");
	    	System.out.println("Code :" +cp.getCode());
		    System.out.println("Solde :" +cp.getSolde());
	    }
	    
	}

}
