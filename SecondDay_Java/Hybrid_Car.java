package com.SecondDayJava;

public class Hybrid_Car implements CNG_Car,PETROL_Car{

	@Override
	public void PETROL_Kit() {
		// TODO Auto-generated method stub
		System.out.println("Using a Petrol_kit for a Hybrid_Car");
		
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println("Using a CNG_kit for a Hybrid_Car");
		
	}

	@Override
	public void CNG_kit() {
		// TODO Auto-generated method stub
		System.out.println("Driving a Hybrid_Car");
		
	}
	


	
}
