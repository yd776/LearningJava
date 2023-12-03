import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int randno=rand.nextInt(100);
    //System.out.println(randno);
    while(true){
    System.out.println("Guess a number between 1 and 100");
    Scanner scan =new Scanner(System.in);
    int playerguess =scan.nextInt();
    if(playerguess == randno){
      System.out.println("Correct you took correct guess");
      break;
    }
    else if(playerguess > randno){
      System.out.println("Your guess is too high");
    }
    else{
      System.out.println("Your guess is too low");
    }
    System.out.println(playerguess);
    }
  }
}
