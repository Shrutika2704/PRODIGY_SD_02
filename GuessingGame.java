package Demo;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = random.nextInt(100) + 1;
		int numberOfAttempts = 0;
		int guessNumber = 0;
		
		System.out.println("Welcome to the Guessing Game!!");
		System.out.println("I have generated a number between 1 and 100. Can you guess it?");
		
		while(guessNumber != randomNumber) {
			System.out.println("Enter your Guess Number :");
			guessNumber = sc.nextInt();
			numberOfAttempts++;
			
			if(guessNumber < randomNumber) {
				System.out.println("Too Low! Try again...");
			}
			else if(guessNumber > randomNumber) {
				System.out.println("Too High! Try again...");
			}
			else {
				System.out.println("Congratulations! You have guessed the number correctly.");
				System.out.println("The number of attempts it took to win the game is : "+numberOfAttempts);
			}
			
		}

	}

}
