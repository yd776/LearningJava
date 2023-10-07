// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");//print hello world
        System.out.println("Yashas Dewan");//print your name
        System.out.println(74+36);///////////////////
        System.out.println(50/3);                   //
        System.out.println(-5+8*6);                 // performing mathematical calculons
        System.out.println((55+9)%9);               //   
        System.out.println(20+(-3*5/8));            //
        System.out.println(5+15/3*2-8%3);//////////// 
        //take two numbers and print their sum
        
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=myobj.nextInt();
         int num2=myobj.nextInt();
         System.out.println(num1+num2);
       
    }
}
