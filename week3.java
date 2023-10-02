class HelloWorld {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        if (b<a){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
        //using while loop for the first time
        int n=4;
        while(n>0){
            n--;
            System.out.println(n);
        }
                int n=10;
        int sum=0;
        while(n>=0){
            sum+=n;
            n--;
        }
        System.out.println(sum);
        sum=0;
        int i=0;
        int t=9;
        do{
            sum+=i;
            i++;
            
        }
        while(i<=t);
        System.out.println(sum);
        
        int sum=0;
        int n=a.length;
        int i;

        // for loop in java
        for(i=0;i<n;i++){
            sum+=a[i];
        }
        return (sum);
        
    }
    
    }
}
