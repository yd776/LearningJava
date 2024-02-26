import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the number n");
        int number = scan.nextInt();
        int n1,n2,n3;
        n1=0;
        n2=1;
        n3=0;
        System.out.print(n1 + " "+ n2+" ");
        for(int i=2;i<number;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+ " ");
        }
    }
}
