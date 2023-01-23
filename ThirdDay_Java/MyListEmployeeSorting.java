package com.ThirdDayJava;

import java.util.ArrayList;
import java.util.List;

public class MyListEmployeeSorting {
	public static void main(String[]args)
	{
		MyListEmployeeSorting.myEmployeeSet();
	}
	public static void myEmployeeSet()
	{
		Employee emp1=new Employee(101,"asha",60);
		Employee emp2=new Employee(102,"nisha",90);
		Employee emp3=new Employee(103,"nilu",900);
		Employee emp4=new Employee(102,"nisha",90);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

}
}
