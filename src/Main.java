import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //Take input from user
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter S, P or R");
        char userMove = inputObj.next().charAt(0);
        System.out.println("User entered " +userMove);

        //To make computer make a move
        //Have to make an array
        char[] maxMove = {'S', 'P', 'R'};

        //To generate a random number
        Random random = new Random();
        int number = random.nextInt(3);
        char computerMove = maxMove[number];
        System.out.println("Computer move: " +computerMove);

        //using loops to generate result
        if(userMove == computerMove){
            System.out.println("Draw!!");
        }else if(userMove == 0 && computerMove == 1 || userMove == 1 && computerMove == 2 || userMove == 2 && computerMove == 0){
            System.out.println("Congrats!! You win.");
        }else {
            System.out.println("You lost. Computer wins.");
        }
    }
}