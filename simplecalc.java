import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        int num1=0;
        int num2=0;
        char operator;
        double ans=0.0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your first number");
        num1=scan.nextInt();
        System.out.println("PLease enter second number");
        num2=scan.nextInt();
        System.out.println("Please enter operation");
        operator=scan.next().charAt(0);
        
        switch(operator){
            case '+' : ans = num1+num2;
                break;
            case '-' :ans=num1-num2;
                break;
            case '*' : ans=num1*num2;
                break;
            case '/': ans=num1/num2;
                break;
        }
        System.out.println(ans);
        
    }
}
