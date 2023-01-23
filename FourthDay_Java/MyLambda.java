package com.FourthDayJava;

import com.SecondDayJava.Operation;

public class MyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation ref=(num1,num2)->
		{
			int sum=num1+num2;
			System.out.println("Addition is :"+sum);
		};
		ref.addition(100, 12);
		ref.addition(123, 456);

	}

}
