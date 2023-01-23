package Assignment1_java;

import java.util.Scanner;

public class Cube{  
	    public static void main(String args[])  
	    {  
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter a number whose cube you want to find");
	    int a=sc.nextInt();  
	    int volume=a*a*a;  
	        System.out.println("Volume ot the cube="+volume);  
	     }  
	}  