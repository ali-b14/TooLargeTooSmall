/**
 * Created by iyasuwatts on 10/17/17.
 */


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        startGame();

    }

    public static int createMysteryNumber(){
        Random randomCounter = new Random();
        int randomNumber = randomCounter.nextInt(11);
        return randomNumber;
    }

    public static void startGame(){
        Scanner scanner = new Scanner(System.in);
        int mysteryNumber = createMysteryNumber();

        while(true){
            System.out.println("Guess a number 0-10" );

            int answer = scanner.nextInt();

            if(answer > mysteryNumber){
                System.out.println("too high go lower");

            }else if(answer < mysteryNumber){
                System.out.println("too low go higher");

            }else{
                System.out.println("you got it right good job!");

                break;
            }

        }

    }

}
