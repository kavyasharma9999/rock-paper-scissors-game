import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // rock paper scissors game
        // declare variable
        // get choice from the users
        // get random choice for the computer
        // check win condition
        // ask to play again
        //goodbye message
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.println("welcome to rock paper scissor game !");
            System.out.println("enter your choice : ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("invalid choice!!! ");
                continue;
            }
            computerChoice = choice[random.nextInt(3)];
            System.out.println(computerChoice);

            if((playerChoice.equals(computerChoice))){
                System.out.println(" its a tie !!! ");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))    ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("you win !! ");
            }
            else{
                System.out.println("you lose !!! ");
            }
            System.out.println("play again ?(yes or no) ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));
        System.out.println("thanks for playing ");
        scanner.close();

    }

    }






        










