package com.ThirdDayJava;
import java.util.Objects;
import java.util.ArrayList;



	public class Employee {
		

	    private int eid;
	    private String name;
	    private double salary;
	  //  private Department department;

	    static int count = 0;
	    //static List<Employee> list = new ArrayList<Employee>();
	    public int getEid() {
	        return eid;
	    }
	    public void setEid(int eid) {
	        this.eid = eid;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    Employee(){
	        count++;
	    }
	    Employee(int eid, String name, double salary){
	        this.eid = eid;
	        this.name = name;
	        this.salary = salary;
	        count++;
	    }
	    public void display(){
	        System.out.println(eid + "  " + name + "  " + salary);
	    }

	    public static void displayCount(){
	        System.out.println("Employee Count : "+count);
	    }
	    private int HashCode()
	    {
	    	
	    	System.out.println("In hashCode");
	    	return eid;
	    	
	    }
	}
	   /*public boolean equals(Object obj)
	    
	    {
	    	System.out.println("In Equals");
	    	if(this==obj)
	    		return true;
	    	if(this==null)
	    		return false;
	    	if(getClass()!=obj.getClass());
	    	return false;
	    	Employee other=(Employee)obj;
	    	try {
				return (eid==other.eid) && Objects.equals(obj)&& Double.doubleToLongBits(salary)==Double.doubleToLongBits(eid);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    		
	    			
	    
	    	
	    }}*/
	
	


