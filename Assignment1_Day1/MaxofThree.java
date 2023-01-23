package Assignment1_java;

import java.util.Scanner;

public class MaxofThree {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		{
			if(a>b && b>c)
			{
				System.out.println("a is larger in three");
				
			}
			else if(b>c && a>c)
			{
				System.out.println("b is larger in three");
				
			}
			else
			{
				System.out.println("c is larger in three");
			}
		}
		
	}

}
