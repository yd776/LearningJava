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











	import java.util.*;

class Employee
{
    String eid;
    String ename;
    String eprojects[];
 //Define all the required methods here
 
 public void Employee(String id,String name, String[] projects){
     
     eid=id;
     ename=name;
     eprojects=projects;
 }
 public void Employee(Employee e2){
     
     eid=e2.eid;
     ename=e2.ename;
     eprojects=e2.eprojects;
 }
 public void Display(){
     System.out.println("id:"+eid);
     System.out.println("name:"+ename);
     System.out.println("projects:");
     for (String s: eprojects){
         System.out.print(s +":");
     }
     Sytem.out.println("\n");
 }
 
 
public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
    
}
public class FClass
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
    }
}
