package br.com.dextra.learning.rs;

import java.util.HashSet;
import java.util.Set;

public class Application extends javax.ws.rs.core.Application {
	
	private Set<Object> singletons = new HashSet<Object>();
 
	public Application() {
		singletons.add(new PetShopRS());
	}
 
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
