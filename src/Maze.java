//Importing Scanner
import java.util.Scanner;
public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner playerInput = new Scanner(System.in); //declaring player input is equal to what?
		String playerName; //declaring player name and the variable
		int playerLevel = 1;
		double playerHealth = 20;
		System.out.println("Welcome! What is your name player?");
		playerName = playerInput.nextLine(); //declaring what player name is suppose to do
		System.out.println("You are " + playerName+ "!");
		System.out.println("Welcome To Alex's Maze!");
		String playerAnswer;	
		do    // doing a do while loop
		{
			System.out.println("You are trapped in Alex's Maze and you need to find a way out! " + "Does " + playerName + " Choose Left Path or Right Path?");
			playerAnswer=playerInput.next();
			if(playerAnswer.equalsIgnoreCase("right"))  //doing a if/else function
			{
				System.out.println(playerName + "  chose the correct path! You have Leveled up!");
				playerLevel++;
				System.out.println(playerName + " is now level " + playerLevel);
				System.out.println("You ran into a obstacle! Oh no! it's addition! What is 12 + 13?");
				int playerAnswer1=playerInput.nextInt();
				if(playerAnswer1==25)
				{
					System.out.println("That is correct! You shall continue. Your current health is " + playerHealth);
					do
					{
						System.out.println(playerName + " notices a Princess trapped in a cage!" + " Does " + playerName + " want to (Save) Princess or keep going (Straight)?");
						playerAnswer=playerInput.next();
						if(playerAnswer.equalsIgnoreCase("save"))   //a "if" statement then a "else if" if the "if" statement isn't true
							{
								System.out.println(playerName + " chose to save the Princess! What a brave player! However Bowser kidknapped you and locked you in the cage with Princess!");
								System.out.println(playerName + "I like to eat food because it taste good and i like it");
								break;
							}
						else if(playerAnswer.equalsIgnoreCase("straight"))
							{
								playerHealth -=5;
								System.out.println(playerName + " chose to continue straight! Foolish choice, you lost 5 health! Your current health is now " + playerHealth);
								System.out.println("Try Again and choose wisely this time!");
							}
					}while (playerAnswer.equalsIgnoreCase("straight"));	
				}
				else 
				{
					System.out.println("You are so dumb. You dont know what 12 + 13 is? You definitely deserve to die. Bye bye! :)");
				}
			}
			else if(playerAnswer.equalsIgnoreCase("left"))
			{
				System.out.println("Sorry " + playerName + " chose the wrong path! Try again.");
			}
		}while (playerAnswer.equalsIgnoreCase("left"));
	}
}
