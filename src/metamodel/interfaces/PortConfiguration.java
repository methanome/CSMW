package metamodel.interfaces;

import metamodel.Binding;

public class PortConfiguration  extends PortFourni{

	private String nom;
	private Binding binding;
	
	public PortConfiguration(String n){
		super(n);
		nom = n;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}
	
	public void receive(Object arg1){
		System.out.println("Port configuration fourni M2");
	}
}