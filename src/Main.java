//
//Opgave del 01
//Gruppe 54
//"DiceGame"
//
//Lavet af 
//Tobias Mohr s133918
//Ronald Nielsen s134539
//Peter Stefaniak s133946
//Mathias Roikj�r s133945
//Jack Kure s144871
//Christoffer Olsen s144873



import Game.Player;
import TestDice.TestDice;
import boundaryToMatador.GUI;

import java.util.Scanner;
public class Main {

	public static void main(String args[]) {

		// V.1.0
		
		// Opretter 2 objekter af klassen Player, og 1 objekt af klassen TestDice
		Player player1 = new Player();
		Player player2 = new Player();
		TestDice diceTest = new TestDice();
		
		// Variabel til at tjekke om player 1 har spillet
		boolean p1hasp = false;
		
		//Opretter scanner til test eller spilstart
		Scanner keyboard = new Scanner(System.in);		
		System.out.println("Tast \"test\" for at teste terning, ellers tryk ENTER");
		
		//scanner til test
		String test = keyboard.nextLine();
		
		//k�rer test metode	
		if (test.equals("test")){
			test = null;
			diceTest.TestProbability();
			System.out.println("Indtast \"test\" igen for at teste sandsynligheden for summene, ellers tryk ENTER to gange");
			test = keyboard.nextLine();
			if (test.equals("test")){
				test = null;
				diceTest.TestSum1to12();
				System.out.println("Indtast \"test\" igen for at teste sandsynligheden for 2 ens");
			}
			test = keyboard.nextLine();
			if (test.equals("test")){
				test = null;
				diceTest.TestPairProbability();
			}
			
		}
			
		System.out.println("Tryk ENTER for at starte");

		keyboard.nextLine();

		//starter lykken hvis du har trykket enter
		while (keyboard != null && !player1.Won()) {
			//GUI bliver �bnet
			GUI.setDice(0,0);
			
			System.out.println();
			System.out.println("Spiller 1 Kaster. Tryk ENTER for at kaste");
			keyboard.nextLine();

			//Hvis player 1 ikke har spillet
			if (!p1hasp) {
				System.out.println("Spiller 1 Tur");
				player1.Game();
				
				//Hvis player 1 har vundet skal while-lykken breakes
				if (player1.Won())
					break;
				
				//Ellers bliver spiller 2 bedt om at begynde p� sin tur
				else{
					System.out.println();
				System.out.println("Spiller 2 Kaster. Tryk ENTER for at kaste");
 
				keyboard.nextLine();
				
				//spiller 1 har spillet
				p1hasp = true;
				}
			}
			
			//Hvis spiller 1 har spillet og han ikke har vundet endnu
			if (p1hasp && !player1.Won()) {
				System.out.println("Spiller 2 Tur");
				player2.Game();
				
				//Spiller et f�r sin tur igen.
				p1hasp = false;
				
				//Hvis spiller 2 har vundet: break ud af while lykken
				if (player2.Won())
					break;
			}

		}
		
		//N�r spillet er slut skal GUI'en, scanneren lukkes og spilleren f�r at vide at han/hun har vundet.
		GUI.close();
		keyboard.close();
		System.out.println("Du har vundet!");

	}

}