import java.util.Random;
import java.util.Scanner;

public class RockPaperAndScissor {
    public static void main(String[] args) {
       // Enter 0 for Rock , 1 for Paper , 2 for Scissors
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 0 for Rock , 1 for Paper , 2 for Scissors : ");
        int userInput = in.nextInt();

        if(userInput > 2){
            System.out.println("Invalid Input");
            System.out.println("Enter 0 for Rock , 1 for Paper , 2 for Scissors ");
            return;
        }

        Random random = new Random();
        int comInput = random.nextInt(3);
        System.out.println("Computer Input is : " + comInput);


        if(userInput == comInput){
            System.out.println("Draw !");
        }
        else if(userInput == 0 && comInput == 2 || userInput == 1 && comInput == 0 || userInput == 2 && comInput == 1){
            System.out.println("Hurray ! You Wins");
        } else {
            System.out.println("Better Luck Next Time ! Computer Wins");
        }
    } 
}
