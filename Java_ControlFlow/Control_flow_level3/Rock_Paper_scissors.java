package more_practice;
import java.util.*;

public class Rock_Paper_scissors {


	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Your choice Between(Rock/paper/scissors)");
     String userInput=sc.nextLine();
     int Comp_choice = (int)(Math.random() * 3); 
     String[] choices= {"rock", "paper", "scissors"};
     System.out.println(choices[Comp_choice]);

     if(userInput.equalsIgnoreCase(choices[Comp_choice])){
    	System.out.println("Tie");	 
     }else if(userInput.equalsIgnoreCase("rock") && Comp_choice==1) {
    	    System.out.println("Lose");   // paper beats rock
     }else if(userInput.equalsIgnoreCase("rock") && Comp_choice==2) {
         System.out.println("Win");    // rock beats scissors
     }
     else if(userInput.equalsIgnoreCase("paper") && Comp_choice==0) {
         System.out.println("Win");    
     }else if(userInput.equalsIgnoreCase("paper") && Comp_choice==2) {
         System.out.println("Lose");   // scissors beat paper
     }else if(userInput.equalsIgnoreCase("scissors") && Comp_choice==0) {
         System.out.println("Lose");   // rock beats scissors
     }else if(userInput.equalsIgnoreCase("scissors") && Comp_choice==1) {
         System.out.println("Win");    // scissors beat paper
     }else {
         System.out.println("Invalid");
     }


 sc.close();
	}

}
