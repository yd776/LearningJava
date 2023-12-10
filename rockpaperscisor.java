import java.util.Random;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    String[] rps ={"rock","paper","scissor"};
    Random rand=new Random();
    int randno=rand.nextInt(rps.length);
    String computermove =rps[randno];
    System.out.println(computermove);
    Scanner scan=new Scanner(System.in);
    String playermove;
    while(true){
    System.out.println("Please give your answer rock paper or scissor");
    playermove =scan.nextLine();
    if(playermove.equals("rock")||playermove.equals("paper")||playermove.equals("scissor")){
       break;
    }
    else{
      System.out.println("Please give correct input");
  
    }
    }
    System.out.println(playermove);
    
    if(playermove.equals(computermove)){
      System.out.println("Game is a tie");
    }
    else if(playermove.equals("rock")){
      if(computermove.equals("paper")){
        System.out.println("Computer wins");
      }
      else{
        System.out.println("Player wins");
      }
      }
    else if (playermove.equals("paper")){
      if(computermove.equals("scissor")){
        System.out.println("Computer wins");
      }
      else{
        System.out.println("Player wins");
      }
      }
    else{
      if(computermove.equals("rock")){
        System.out.println("computer wins");
      }
      else{
        System.out.println("player wins");
      }
    }
    scan.close();
  }
}
