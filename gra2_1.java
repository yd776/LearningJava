// find the sum of the series  12 + ( 12 + 22 ) + ( 12 + 22 + 32 ) + ......... + ( 12 + 22 + .... + n2 )
import java.util.Scanner;  // Import Scanner

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        
        int total=0;
        int sum=0;
        int j=n;
        while (j>0){
            
            for (int i=1;i<=n;i++){
                sum+=(i*i);
                total +=sum;
                
            
            j--;
        }
        System.out.println(total);
        
       
        }
        sc.close();  
    }
}
