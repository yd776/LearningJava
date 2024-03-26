public class genericexample{
    public static void main(String[] args){
        printer<Integer> p=new printer<Integer>(25);
        printer <String> s=new printer<String>("hello");
        s.print();
        p.print();
    }
}
