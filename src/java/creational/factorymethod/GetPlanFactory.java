package java.creational.factorymethod;

import java.io.IOException;

/*  Factory method is a creational design pattern, i.e., related to object creation. 
  	In Factory pattern, we create object without exposing the creation logic to client 
  	and the client use the same common interface to create new type of object.
	The idea is to use a static member-function (static factory method) which creates & returns instances, 
	hiding the details of class modules from user.
	*/


public class GetPlanFactory {
	
	public Paln getBillPlan(String PlanName) throws IOException {
		
		if (PlanName.equalsIgnoreCase("Domastic")) {
			return new Domastic();
		}else if (PlanName.equalsIgnoreCase("Commertial")) {
			return new Commertial();
		}else if (PlanName.equalsIgnoreCase("Institutional")) {
			return new Institituonal();
		}
		return null;
	}
}
