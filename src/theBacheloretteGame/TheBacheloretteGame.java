package theBacheloretteGame;
/**
 * This a choose your own adventure game with a romantic spin,
 * letting the user choose their perfect bachelor based
 * on a series of dates.
 * 
 * @author Emily Satterfield
 * @version 2 November 2017
 */

import java.util.Scanner;
public class TheBacheloretteGame
{
	private static Scanner userInput = new Scanner(System.in);
	
	
	/**
	 * Collects the name of the user, sets number of roses, and initiates 
	 * a full list of men for first round and makes an empty list for the second round
	 * second round.
	 */

	public static void collectName()
	{  
		int numberOfRoses = 2;
		int listOfMen = 7;
		int listOfMenRound2 = 0;
		System.out.println("Welcome to the bachelorette! What's your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, " + name + "! Who would you like to date first?");
		System.out.println("Clayton is a lawyer, Nate is a oceanographer,");
		System.out.println("and Marcos is an astronaut");
		System.out.println("You have two roses, you can give each one to a man of your choosing");
		System.out.println("If you date someone and choose not to give them a rose, they go home.");
		System.out.println("Then you will choose someone new to date.");
		chooseFirstDate(numberOfRoses, listOfMen, listOfMenRound2);
	} //end collectName

	/**
	 * Checks if there are roses left for the first round and gives 
	 * the user options for their first round of dates based on 
	 * who they have already dated.
	 * 
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */

	public static void chooseFirstDate(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		if (numberOfRoses>0 && listOfMen != 0)
		{
			parseListOfMen(listOfMen);
			String firstMan = userInput.nextLine();
			if (firstMan.equals("Marcos"))
			{
				firstDateMarcos(numberOfRoses, listOfMen, listOfMenRound2);
			}
			else if (firstMan.equals("Clayton"))
			{
				firstDateClayton(numberOfRoses, listOfMen, listOfMenRound2);
			}
			else if (firstMan.equals("Nate"))
			{
				firstDateNate(numberOfRoses, listOfMen, listOfMenRound2);
			}

		}
		else if (numberOfRoses == 0 || (listOfMen == 0 && listOfMenRound2 !=0)){
			System.out.println("Time for your second dates!");
			boolean haveFinalRose = true;
			chooseSecondDate(haveFinalRose, listOfMenRound2, null);

		}

	}//end chooseFirstDate

	/**
	 *Decodes the integer listOfMen into strings based on binary combinations,
	 * and prints the available options on the screen.
	 *
	 * @param the integer list of men that changes with each date
	 */

	public static void parseListOfMen(int listOfMen)
	{
		if (listOfMen == 7)
		{
			System.out.println("Choose either: Nate, Clayton, or Marcos");
		}
		else if (listOfMen == 6)
		{
			System.out.println("Choose either: Nate or Clayton");
		}
		else if (listOfMen == 5)
		{
			System.out.println("Choose either: Nate or Marcos");
		}
		else if (listOfMen == 4)
		{
			System.out.println("Just Nate is left.");
		}
		else if (listOfMen == 3)
		{
			System.out.println("Choose either: Clayton or Marcos");
		} 
		else if (listOfMen == 2)
		{
			System.out.println("Just Clayton is left.");
		}
		else if (listOfMen == 1)
		{
			System.out.println("Just Marcos is left.");

		}

	}//end parseListOfMen

	/**
	 *Creates a first date for Marcos and allows the user to choose
	 * whether to go to bowling or dancing, calls a method for each 
	 *scenario to set up the date.
	 * 
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */


	public static void firstDateMarcos(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		System.out.println("You chose Marcos!");
		System.out.println("where would you like to go on your first date?");
		System.out.println("Type 'd' for dinner and dancing.");
		System.out.println("Type 'b' for bowling");

		String marcosDatePick = userInput.nextLine();
		if (marcosDatePick.equals("b"))
		{
			dateBowling(numberOfRoses, listOfMen, listOfMenRound2);
		}
		else if (marcosDatePick.equals("d"))
		{
			dateDancing(numberOfRoses, listOfMen, listOfMenRound2);
		}
	}//end firstDateMarcos

	/**
	 *Creates a first date for Clayton and allows the user to choose
	 *whether to go to the movies or the park, calls a method for each 
	 *scenario to set up the date.
	 *
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */

	public static void firstDateClayton(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		System.out.println("You chose Clayton!");
		System.out.println("Where would you like to go on your first date?");
		System.out.println("Type 'p' to go on a romantic date at the park.");
		System.out.println("Type 'm' to go to the movies");
		String claytonDatePick = userInput.nextLine();

		if (claytonDatePick.equals("p"))
		{
			dateAtThePark(numberOfRoses, listOfMen, listOfMenRound2);
		}
		else if (claytonDatePick.equals("m"))
		{
			dateAtTheMovies(numberOfRoses, listOfMen, listOfMenRound2);
		}
	} //end firstDateClayton


	/**
	 *Creates a first date for Nate and allows the user to choose
	 *whether to go to the movies or apple picking, calls a method for each 
	 *scenario to set up the date.
	 *
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */


	public static void firstDateNate(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		System.out.println("You chose Nate!");
		System.out.println("Where would you like to go on your first date?");
		System.out.println("Type 'z' to go to the zoo");
		System.out.println("Type 'a' to go apple picking");
		String nateDatePick = userInput.nextLine();
		if (nateDatePick.equals("z"))
		{
			dateAtTheZoo(numberOfRoses, listOfMen, listOfMenRound2);
		}
		if (nateDatePick.equals("a"))
		{
			dateApplePicking(numberOfRoses, listOfMen, listOfMenRound2);
		}
	}//end firstDateNate


	/**
	 *Creates a first date for Clayton at the movies and allows to 
	 *user to decide whether or no to get popcorn,
	 *and whether or not to give him a rose, removes him from 
	 *list of men after date.
	 *
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */

	public static void dateAtTheMovies(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		System.out.println("You and Clayton walk into the movies");
		System.out.println("You are having a great time, but realize you are a little hungry");
		System.out.println("Do you get popcorn? (yes or no)");
		String popcornDecision = userInput.nextLine();
		if (popcornDecision.equals("yes"))
		{
			System.out.println("oh no! He chokes on a popcorn kernel and you have to leave!");
			System.out.println("Unfortunately, Clayton cannot continue. Pick a new man to date");
			listOfMen = listOfMen - 2;
		}
		else if(popcornDecision.equals("no"))
		{
			System.out.println("You had a nice time, do you want to give him a rose?");
			String roseDecision = userInput.nextLine();
			if(roseDecision.equals("yes"))
			{ 
				System.out.println("Yay! He will move to round 2! Time to pick a new date");
				numberOfRoses--;
				listOfMen = listOfMen - 2;
				listOfMenRound2 = listOfMenRound2 + 2;
			}
			else
			{
				System.out.println("That's okay!");
				listOfMen = listOfMen -2;
			}
		}
		chooseFirstDate(numberOfRoses, listOfMen, listOfMenRound2);
	}//end dateAtTheMovies

	/**
	 *Creates a first date for Clayton at the park and removes
	 *Clayton from the list of available dates when it goes
	 *badly.
	 *
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */

	public static void dateAtThePark(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		System.out.println("You and Clayton take a walk in the park");
		System.out.println("You are having a great time, but Clayton has a terrible pollen allergy");
		System.out.println("Unfortunately, Clayton cannot continue. Pick a new man to date");
		listOfMen = listOfMen - 2;
		chooseFirstDate(numberOfRoses, listOfMen, listOfMenRound2);

	}//end dateAtThePark


	/**
	 *Creates a first date for Nate apple picking and allows the 
	 *user to decide whether or not to give him a rose, removes him from 
	 *list of men after date.
	 *
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */

	public static void dateApplePicking(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		System.out.println("You are at an orchard with Nate.");
		System.out.println("He is very polite and you have a great time.");
		System.out.println("Do you want to give Nate a rose? (yes or no)");
		String roseDecision = userInput.nextLine();
		if (roseDecision.equals("yes"))
		{
			System.out.println("Yay! He will move to round 2! Time to pick a new date");
			numberOfRoses--;
			listOfMenRound2 = listOfMenRound2 + 4;
			listOfMen = listOfMen -4;
		}
		else
		{
			listOfMen = listOfMen -4;
		}
		chooseFirstDate(numberOfRoses, listOfMen, listOfMenRound2);
	}//end dateApplePicking

	/**
	 *Creates a first date for Nate at the zoo and allows the 
	 *user to decide whether or not to give him a rose, removes him from 
	 *list of men after date.
	 *
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */

	public static void dateAtTheZoo(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		System.out.println("You are at the zoo with Nate.");
		System.out.println(" You are having a great time! ");
		System.out.println("Oh no! A hyena is on the loose!");
		System.out.println("Nate is attacked! He cannot continue");
		System.out.println("");
		System.out.println("Time to choose a new date!");

		listOfMen = listOfMen - 4;
		chooseFirstDate(numberOfRoses, listOfMen, listOfMenRound2);

	}// end dateAtTheZoo
	/**
	 *Creates a first date for Marcos dancing and allows to 
	 *user to decide whether or not to give him a rose, removes him from 
	 *list of men after date.
	 *
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */

	public static void dateDancing(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		System.out.println("You and Marcos go out for a night on the town");
		System.out.println("You go dancing and have dinner");
		System.out.println("He has some great moves! You have a great time.");
		System.out.println("Do you want to give him a rose?");
		String roseDecision = userInput.nextLine();
		if(roseDecision.equals("yes"))
		{ 

			numberOfRoses--;
			listOfMenRound2 = listOfMenRound2 + 1;
			listOfMen = listOfMen - 1;
			System.out.println("Yay! He will move to round 2! Time to pick a new date");
		}
		else
		{
			System.out.println("That's okay!");
			listOfMen = listOfMen - 1;
		}
		chooseFirstDate(numberOfRoses, listOfMen, listOfMenRound2);
	} //end dateDancing

	/**
	 *Creates a first date for Marcos bowling and allows to 
	 *user to decide whether or not to go easy on him or go to the arcade,
	 *and whether to give him a rose, removes him from 
	 *list of men after date.
	 *
	 *@param integer for number of roses left in first round
	 *@param integer for list of men in first round
	 *@param integer for list of men that move on to second round
	 */

	public static void dateBowling(int numberOfRoses, int listOfMen, int listOfMenRound2)
	{
		System.out.println("You and Marcos go out for bowling");
		System.out.println("Turns out you are really good at bowling,");
		System.out.println("Do you want to go easy on him?");
		System.out.print("Type 'y' for yes, 'n' for no, and 'a' to go ");
		System.out.println("to the arcade instead.");
		String bowlingDecision = userInput.nextLine();
		if (bowlingDecision.equals("y"))
		{
			System.out.println("He doesn't rub it in when he wins.");
			System.out.println("Great date!");

		}
		else if (bowlingDecision.equals("n"))
		{
			System.out.println("He is gracious about losing.");
			System.out.println("What a good sport!");
			System.out.println("Great date!");
		}
		else if (bowlingDecision.equals("a"))
		{
			System.out.print("He wins a 1000 tickets and");
			System.out.println("spends it on a giant bear for you");
			System.out.println("Great date!");
		}

		System.out.println("Do you want to give him a rose?");
		String roseDecision = userInput.nextLine();
		if(roseDecision.equals("yes"))
		{ 
			System.out.println("Yay! He will move to round 2! Time to pick a new date");
			numberOfRoses--;
			listOfMen = listOfMen - 1;
			listOfMenRound2 = listOfMenRound2 + 1;
		}
		else
		{
			System.out.println("That's okay!");
			listOfMen = listOfMen - 1;
		}

		chooseFirstDate(numberOfRoses, listOfMen, listOfMenRound2);   
	}//end dateBowling
	
	 /**
	 *Starts the second round with the men that were added
	 *to the list of men for round 2 and allows the user to 
	 *choose which one to date.
	 *
	 *@param boolean for if they have a final rose or not
	 *@param integer for list of men in first round
	 *@param String for name of the final Bachelor
	 *
	 */

	public static void chooseSecondDate(boolean haveFinalRose, int listOfMenRound2, String nameOfBachelor)
	{

		if (haveFinalRose) {
			parseListOfMen(listOfMenRound2);
			String name = userInput.nextLine();
			if (name.equals("Nate")) {
				secondRoundDateNate(haveFinalRose, listOfMenRound2);
			}
			else if (name.equals("Clayton")) {
				secondRoundDateClayton(haveFinalRose, listOfMenRound2);
			}
			else if (name.equals("Marcos")) {
				secondRoundDateMarcos(haveFinalRose, listOfMenRound2);
			}


		}
		else
		{
			System.out.println("Congratulations! You and " + nameOfBachelor +
					" live happily ever after!");
		}

	}//end chooseSecondDate
	
	/**
	 *Starts the second round date with Marcos, changes listOfMen and 
	 *allows user to give final rose or not.
	 *
	 *@param boolean for if they have a final rose or not
	 *@param integer for list of men in first round
	 *@param String for name of the final Bachelor
	 */

	private static void secondRoundDateMarcos(boolean haveFinalRose, int listOfMenRound2) 
	{
		String bachelorName;
		System.out.println("You and Marcos go on a long walk on the beach");
		System.out.println("You have a really great time, and he is");
		System.out.println("such a gentleman. ");
		System.out.println("Do you want to give him a rose?");
		String finalRoseDecision = userInput.nextLine();
		if (finalRoseDecision.equals("yes")) {
			haveFinalRose = false;
			bachelorName = "Marcos";
		}

		else{
			System.out.println("that's okay!");
			listOfMenRound2 = listOfMenRound2 - 1;
			bachelorName = null;
		}
		chooseSecondDate(haveFinalRose, listOfMenRound2, bachelorName);
	}//end secondRoundDateMarcos
	
	/**
	 *Starts the second round date with Clayton, changes listOfMen and 
	 *allows user to give final rose or not.
	 *
	 *@param boolean for if they have a final rose or not
	 *@param integer for list of men in first round
	 *@param String for name of the final Bachelor
	 */

	private static void secondRoundDateClayton(boolean haveFinalRose, int listOfMenRound2) 
	{
		String bachelorName;
		System.out.println("You and Clayton go out for dinner");
		System.out.println("Clayton tells you you should lay off the ");
		System.out.println("cake, you are very insulted. ");
		System.out.println("Do you want to give him a rose?");
		String finalRoseDecision = userInput.nextLine();
		if (finalRoseDecision.equals("yes")) {
			haveFinalRose = false;
			bachelorName = "Clayton";
		}

		else{
			System.out.println("that's okay!");
			listOfMenRound2 = listOfMenRound2 - 2;
			bachelorName = null;
		}
		chooseSecondDate(haveFinalRose, listOfMenRound2, bachelorName);
	}//end secondRoundDateClayton
	
	/**
	 *Starts the second round date with Nate, changes listOfMen and 
	 *allows user to give final rose or not.
	 *
	 *@param boolean for if they have a final rose or not
	 *@param integer for list of men in first round
	 *@param String for name of the final Bachelor
	 */

	private static void secondRoundDateNate(boolean haveFinalRose, int listOfMenRound2) 
	{
		String bachelorName;
		System.out.println("You and Nate go to the circus.");
		System.out.println("A tiger goes wild and everyone starts freaking ");
		System.out.println("out. All of a sudden, the tiger runs toward you. ");
		System.out.println("Instead of protecting you, he uses you as a ");
		System.out.println("shield. How rude!");
		System.out.println("Do you want to give him a rose?");
		String finalRoseDecision = userInput.nextLine();
		if (finalRoseDecision.equals("yes")) {
			haveFinalRose = false;
			bachelorName = "Nate";

		}

		else{
			System.out.println("that's okay!");
			listOfMenRound2 = listOfMenRound2 - 4;
			bachelorName = null;
		}
		chooseSecondDate(haveFinalRose, listOfMenRound2, bachelorName);
	}//end secondRoundDateNate

	/**
	 * Initiates the name collecting method.
	 * 
	 * @param args string containing command line arguments
	 */
	public static void main(String[] args)
	{
		collectName();


	} //end main

}//end TheBacheloretteGame class

