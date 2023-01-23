package com.SecondDayJava2;

public class Division {
	public void Division(int num1,int num2){
		try {
		System.out.println("In division");
		
		int div=num1/num2;
		System.out.println("Division is :"+div);
		}
		catch(Exception e) {
		System.out.println(e);
		}
		finally {
			System.out.println("Finally..");
		}
			
		
		System.out.println("Division done");
		
	}
	public void Just_Fun() throws InterruptedException,ClassNotFoundException{
		
	Class.forName("");
				System.out.println("Just Enjoying...");
		Thread.sleep(1000);
	}
		
	
}



