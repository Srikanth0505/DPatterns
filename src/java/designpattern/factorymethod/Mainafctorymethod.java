package com.dp.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainafctorymethod {

	public static void main(String[] args) throws IOException {
		
		GetPlanFactory factory=new GetPlanFactory();
		
		System.out.println("plaese enter Plan Name:");
		BufferedReader brr= new BufferedReader(new InputStreamReader(System.in));
		String PlanName=brr.readLine();
		
		System.out.println("plaese enter Units to be calculate:");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int units=Integer.parseInt(br.readLine());
		
		System.out.println("Calculated Paln is:"+PlanName);
		System.out.println("Units :"+units);
		Paln p=factory.getBillPlan(PlanName);
		p.getRate();
		p.getCalculateBills(units);
		
		
	}

}
