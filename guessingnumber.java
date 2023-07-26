import java.util.Scanner;

public class guessingnumber {

	public static void guessingNumberGame()
	{
		
		Scanner sc = new Scanner(System.in);

	
		int num = 1 + (int)(100* Math.random());

		
		int n_trial= 5;

		int i, guess;

		System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");

		
		for (i = 0; i < n_trial; i++) {

			System.out.println("Guess the number:");

			
			guess = sc.nextInt();

			
			if (num == guess) {
				System.out.println("Congratulations!"+ " You guessed the number.");
				break;
			}
			else if (num > guess&& i != n_trial - 1) {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (num < guess&& i != n_trial - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == n_trial) {
			System.out.println("You have exhausted"+ " n trials.");

			System.out.println("The number was " + num);
		}
	}

	
	public static void main(String arg[])
	{

		
		guessingNumberGame();
	}
}
