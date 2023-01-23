package com.ThirdDayJava;
import java.util.Scanner;
public class Qutient {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter Your Divident");
			int Divident=sc.nextInt();
			System.out.println("Enter your Divisor");
			int Divisor=sc.nextInt();
			int Quotient=Divident/Divisor;
			int Remainder=Divident%Divisor;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Finally Done..");
		}
	
		}
	}


