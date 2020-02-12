package com.dp.factorymethod;

import java.io.IOException;

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
