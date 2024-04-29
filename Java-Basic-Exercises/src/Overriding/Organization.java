package Overriding;

public class Organization extends  Employee{

    //overridden method
    public void  employeeDetails(String name, String department, Long salary){
        System.out.println("Name : "+ name + " Department : " + department + " Salary : " + salary);
    }
}
