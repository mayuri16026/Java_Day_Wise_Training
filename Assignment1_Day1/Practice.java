package Assignment1_java;

public class Practice{
    public static void main(String[] args){

        Employee.list.add(new Employee(2000156, "Deepak", 35000));
        Employee.list.add(new Employee(2000152, "Abhishek", 35000));
        Employee.list.add(new Employee(3000645, "Ajay", 55000));
        Employee.list.add(new Employee(4000675, "Mayank", 75000));
        Employee.list.add(new Employee(4000678, "Devesh", 58000));

        System.out.println("List of Employees having salary greater than 50000 : ");
        for(int i=0; i<Employee.list.size(); i++){
            if(Employee.list.get(i).getSalary() > 50000){
                System.out.println(Employee.list.get(i).getName());
            }
        }
        Employee.displayCount();
    }
}