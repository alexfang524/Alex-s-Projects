import java.util.Scanner;
import java.util.Random;

public class CaveAdventures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner playerInput= new Scanner(System.in);  
		Random randomGenerator = new Random();

		String playerName;
		int playerLevel= 2;  
		double playerHealth= 15; 

		System.out.println("What is your name?");
		playerName = playerInput.nextLine();

		System.out.println(" Hi I am " + playerName);
		System.out.println("You made it to the entrance of the cave!"); 
		System.out.println("Congradulations! You leveled up! You are now level " + playerLevel);
		System.out.println("There are two paths. Which one should player take? Left or Right?");
		String playerAnswer=playerInput.nextLine();

		double rockDamage;
		if(playerAnswer.equalsIgnoreCase("right"))
		{
			System.out.println("Player chose the correct path!"); 
			System.out.print ("Your Health is " + playerHealth);
			double rockDamage1 = 1+randomGenerator.nextInt(6);
			System.out.println(" You took damage by rock!");
			playerHealth -= rockDamage1; 
			System.out.print("You took " + rockDamage1 + " damage. You have " + playerHealth + " health remaining");
			System.out.println(" You exited the cave and drank water from a pond!");
			playerLevel++;
			System.out.println("Oh no! The water was posionous and you lost one life.");
			playerHealth--;
			System.out.println("Your health is currently now " + playerHealth + ". You wander into the forest and find a suspicious chest. Does " + playerName + " wish to (open) it or (continue)?");
			playerAnswer = playerInput.nextLine();
			if(playerAnswer.equalsIgnoreCase("open"))
			{

				System.out.println("You found a medkit and backpack! Does " + playerName + " wish to consume medkit for +6 Health or save medkit for later(say yes or no)?");
				playerAnswer = playerInput.nextLine();
				if(playerAnswer.equalsIgnoreCase("yes"))
				{
					playerHealth += 6;
					System.out.println(playerName + " health is now " + playerHealth + playerName + " is now full health!");
				}
				else if(playerAnswer.equalsIgnoreCase("no"))
				{
					System.out.println("You moved medkit to your backpack!");		
				}
			}

			else if(playerAnswer.equalsIgnoreCase("continue"))
			{
				System.out.println(playerName + " wishes to continue on to the Mountain of Shizkobober. As you continued on your journey you encounter King Bob of Shizkobober.");
				System.out.println("If you defeat King Bob you will be the newly crowned king and gain control over all of Shizkobober! There is a gun on your left and a sword on the right.");
				System.out.println("Which weapon will you choose?");
				playerAnswer=playerInput.nextLine();
				if(playerAnswer.equalsIgnoreCase("gun"))
					{
						System.out.println("Bad choice! The gun had no ammo and King Bob ate you for dinner. The End!");
						System.exit(0);
					}
				else if(playerAnswer.equalsIgnoreCase("sword"))
					{
						System.out.println("Smart choice! The gun had no ammo anyways. In order to kill King Bob you must answer this question to land a critical hit!");
						System.out.println("The question is this: What is 1 divided by 0?");
						playerAnswer=playerInput.nextLine();
						if(playerAnswer.equalsIgnoreCase("undefined"))
						{
							System.out.println("Congrats you have traveled far on your journey and you are now the King of Shizkobober! THE END!");
						}
						else
						{
							System.out.println("Haha trick question! You can't divide by 0. It's always undefined! Game Over! Bye bye! :)");
							System.exit(0);
						}
					
					}
			}			
		}

		else if(playerAnswer.equalsIgnoreCase("left"))
		{
			System.out.println("The path is dark and you get hit by another Rock!");
			rockDamage = 15.0;
			playerHealth -= rockDamage;
			System.out.println("You took " + rockDamage + " damage. You have " + playerHealth + " health remaining.");
			if( playerHealth <= 0);
			System.out.println("Oh no, " + playerName +" died! Player was level " + playerLevel);
			System.exit(0);		
		}



	}
}



