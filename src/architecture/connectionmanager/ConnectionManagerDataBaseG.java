package architecture.connectionmanager;

import metamodel.interfaces.Glue;
import metamodel.interfaces.Role;

public class ConnectionManagerDataBaseG extends Glue
{
	private ConnectionManagerDataBaseRR ConnectionManagerDataBaseRoleRequis;
	private ConnectionManagerDataBaseRF connectionManagerDataBaseRoleFourni;
	
	public ConnectionManagerDataBaseG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}