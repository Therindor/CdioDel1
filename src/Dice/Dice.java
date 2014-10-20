//
//Opgave del 1
//Gruppe 54
//"DiceGame"
//
//Lavet af 
//Tobias Mohr s133918
//Ronald Nielsen s134539
//Peter Stefaniak s133946
//Mathias Roikjær s133945
//Jack Kure s144871
//Christoffer Olsen s144873


package Dice;

import java.util.Random;

public class Dice {

	public static int dice1, dice2;

	// roll the dice
	public static void rollDice() {
		Random r = new Random();
		
		dice1 = r.nextInt(6) + 1;
		dice2 = r.nextInt(6) + 1;
		
		}
	
}
