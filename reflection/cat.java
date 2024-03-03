public class cat{
    private final String name;
    private int age;
    
    
    public cat(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getname(){
        return name;
    }
    
    public int getage(){
        return age;
    }
    
    public void setage(int age){
        this.age=age;
    }
    
    public void meow(){
        System.out.println("meow");
    }
    
    private void heythisisprivate(){
        System.out.println("How do you call this");
    }
    
    public static void thisisapublicmethod(){
        System.out.println("Im a public and static");
    }
    
    private static void thisisprivatestaticmethod(){
        System.out.println("This is a private static method");
    }
}
