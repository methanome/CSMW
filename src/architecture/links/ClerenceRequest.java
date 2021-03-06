package architecture.links;

import architecture.connectionmanager.ConnectionManagerSecurityManagerG;
import architecture.securitymanager.SecurityManagerConnectionManagerG;
import metamodel.*;

public class ClerenceRequest extends ComposantConcret{

	private ConnectionManagerSecurityManagerG glue1;
	private SecurityManagerConnectionManagerG glue2;
	
	public ClerenceRequest(String name) {
		super(name);
	}

	public ConnectionManagerSecurityManagerG getGlue1() {
		return glue1;
	}

	public void setGlue1(ConnectionManagerSecurityManagerG glue1) {
		this.glue1 = glue1;
	}

	public SecurityManagerConnectionManagerG getGlue2() {
		return glue2;
	}

	public void setGlue2(SecurityManagerConnectionManagerG glue2) {
		this.glue2 = glue2;
	}

}
