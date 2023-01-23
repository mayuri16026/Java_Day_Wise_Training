package Assignment1_java;
import java.util.List;
import java.util.ArrayList;


	public class Employee {
		

	    private int eid;
	    private String name;
	    private double salary;
	  //  private Department department;

	    static int count = 0;
	    static List<Employee> list = new ArrayList<>();
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
	}
	
	

