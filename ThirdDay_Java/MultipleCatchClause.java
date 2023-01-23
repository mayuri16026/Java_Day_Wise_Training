package com.ThirdDayJava;
import java.util.Scanner;
public class MultipleCatchClause
{
public static void main(String[] args) 
{ 
try
{ 
 int arr[] = new int[6]; 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter any number");
 int n=sc.nextInt();
 arr[3] = 20/n; // Exception occurred. 
 System.out.println("I am in try block"); 
} 
catch(ArithmeticException ae)
{ 
 System.out.println("A number cannot be divided by zero, Illegal operation in java"); 
} 
catch(ArrayIndexOutOfBoundsException e)
{ 
 System.out.println("Accessing array element outside of specified limit"); 
} 
catch(Exception e)
{ 
 System.out.println(e.getMessage()); 
} 
System.out.println("I am out of try-catch block"); 
 } 
}

