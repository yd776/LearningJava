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
