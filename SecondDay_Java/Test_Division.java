package com.SecondDayJava2;

public class Test_Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main Division");
		Division div=new Division();
		div.Division(10, 0);
		try {
		div.Just_Fun();
		}
		catch(ClassNotFoundException|InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("In Main End");
		}
		

	


}
