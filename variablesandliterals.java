        System.out.println("hellow world");
        int num1=7;
        int num2=8;
        float f1=5.0f;
        double d1=5.02;
        double result;
        result=d1+f1;
        System.out.println(result);
        // literals 
        // We can perform many action on the variables that we are putting in 
        char c='a';
        c++;
        System.out.println(c);//should give b
        //casting conversion of one frmat to another

                //casting 
        int a=12;
        System.out.println(a);
        double b=13.3;
        System.out.println(b);
        a=(int)b;
        System.out.println(a);
        //type promotions
        byte a1=30;
        byte b1=10;
        int result =a1*b1;
        System.out.println(result);
        //here byte * byte gives us int 
            int num1=7;
            int result=num1++;
            int result1=++num1;
            System.out.println(result);
            System.out.println(result1);

         (String[] args){
        int x=7;
        int y=5;
        int a=5;
        int b=9;
        boolean result=x>y && a<b;
        System.out.println(result);


        int x=10;
if (x>=10)
System.out.println("Hello");
else
System.out.println("Bye");
if (true){
    System.out.println("Hello");
}
if (x >9 && x<=20){
    System.out.println("J");
}
    int x=8;
    int y=7;
    int z=9;
    if(x>y && x>z)
        System.out.println("J");
    else if(y>x && y>z)
    System.out.println("d");
    else
        System.out.println("l");
