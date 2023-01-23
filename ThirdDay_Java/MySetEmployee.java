package com.ThirdDayJava;
import java.util.Set;
//import com.crio.Employee;
import java.util.HashSet;

public class MySetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySetEmployee.myEmployeeSet();
	}
	public static void myEmployeeSet()
	{
		Employee emp1=new Employee(101,"asha",60);
		Employee emp2=new Employee(102,"nisha",90);
		Employee emp3=new Employee(103,"nilu",900);
		Employee emp4=new Employee(102,"nisha",90);
		
			
		Set<Employee>set=new HashSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		System.out.println(set);
	}

}
