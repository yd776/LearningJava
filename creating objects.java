class Calculator{ //creating a new class named calculator
    
    int a;
    public int add(int n1,int n2)// creating a method so that i can call the functions directly
    {
        System.out.println("adding the two numbers"); 
        int r= n1+n2;
        return r;
    }
    
}
class Main {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        Calculator calc =new Calculator(); // creating a reference variable so that i can call the functions in calculator class
        int result= calc.add(num1,num2);
        
        //int result = num1+num2;
        System.out.println(result);
    }
}


// Week2 GA2.2 create methods and constructors for a questions



import java.util.Scanner;

class Employee{
	    String ename;
	    String eid;
	    String edept;
	    
	    public Employee(){
		        ename = "guest";
	    }
//Define the required methods

        public void Emplaoyee(name,id,dept){
            ename=name;
            eid=id;
            edept=dept;
            
        }
        public void copyDept(Employee e2){
            
            this.edept=e2.edept;
        }
        public void displayDetails(){
            
            System.out.println("ename : "+ename);
            System.out.println("eid : "+eid);
            System.out.println("edept : "+edept);
        }

     
public class FClass 
{
	    public static void main(String args[]) 
	    {
		        Scanner s = new Scanner(System.in);
		        Employee e1 = new Employee();
		
		        //Enter name of the employee
		        String name = s.nextLine();
		
		        //Enter id of the employee
		        String id = s.nextLine();
		
		        //Enter department of the employee
		        String dept = s.nextLine();
		
		        Employee e2 = new Employee(name,id,dept);
		
		        e1.copyDept(e2); 
		        //Copies the department name of e2 into e1's department name.
		
		        e1.displayDetails();
	    }
}
