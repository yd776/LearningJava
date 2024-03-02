import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int a;
	    System.out.println("Please give the number of elemnts in the array");
	    a=scan.nextInt();
	    int array[];
		array = new int[a];
		for(int i=0;i<array.length;i++){
		    int b=scan.nextInt();
		    array[i]=b;
		}
		System.out.println("Reversing the list");
		for (int i=0;i<array.length/2;i++){
		    int temp=array[i];
		    array[i]=array[array.length-1-i];
		    array[array.length-1-i]=temp;
		}
		for(int i=0;i<array.length;i++){
		    System.out.print(array[i]+" ");
		}
	}
}

// using arrayList instead of array 


	public static void main(String[] args) {
    ArrayList array = new ArrayList();
    Scanner scan =new Scanner(System.in);
    System.out.println("Please enter the total number of elemnts in the array");
    int a=scan.nextInt();
    for(int i=0;i<a;i++){
        int b=scan.nextInt();
        array.add(b);
    }
    Collections.reverse(array);
    System.out.println(array);
