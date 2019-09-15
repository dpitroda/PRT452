
import java.util.Scanner;
import java.util.Random;

public class Guessnumbers extends Superclass implements Checkingvalues
{
	private static Scanner keyboard;

	static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        if (Character.isDigit(s.charAt(i))  
            == false) 
            return false; 
  
        return true; 
    }
	
  public static void main(String args[]) {
    keyboard = new Scanner(System.in);
    int attemptsNum = 1;
	 Random generator = new Random();
    int a = generator.nextInt(100)+1;
	String quit;
    String guess = "";

    System.out.println("I am thinking of a number from 1 to 100"
        + " ... guess what it is ? Or Enter q to Quit...!!!");
		
	while (!guess.equals(String.valueOf(a))) 
		{
		String string = guess = keyboard.next();
		
		
		if (isNumber(guess)) 
		{
			if(Integer.parseInt(guess)==a)
			  {
					System.out.println("Right!");
			  }
			  else if (Integer.parseInt(guess)<a) 
			  {
				System.out.println("Your guess was too LOW.");
				attemptsNum++;
			  } 
			  else 
			  {
				System.out.println("Your guess was too HIGH.");
				attemptsNum++;
			  }
		}
	  else
		{
			if (guess.equals("q"))
			{
				guess = "";
				System.out.println("Goodbye....!!!");
				System.exit(0);
			}else {
			System.out.println("Valid input for Quit"); 
			}
		}
		
		  }
    System.out.println("Congratulations. You guessed the number with "
        + attemptsNum + " tries!");
}
}