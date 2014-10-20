//
//Opgave del 1
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


package Game;

import java.util.Scanner;
import Dice.Dice;
import boundaryToMatador.GUI;

public class Scoreboard {

	boolean won = false;
	private int lose = 0;
	private int score = 0;
	private int totalScore, prevScore;
	int[] Dices = new int[4];
	int secondThrow;
	
	

	// metode til print
	public void print() {

		System.out.println("Terning 1: " + Dices[0]);
		System.out.println("Terning 2: " + Dices[1]);

		// print af totalScore
		System.out.println("Score: " + gettotalScore());

		// Check til om den gemmer gamle kast
		System.out.println("Dette kast: " + Dices[0] + " " + Dices[1]);
		System.out.println("Sidste kast: " + Dices[2] + " " + Dices[3]);

		GUI.setDice(Dices[0], Dices[1]);
	}

	// Checker dine terninger mht. til dit kast
	public void checkThrow() {

		
		// Hvis du har sl�et 2 seksere 2 gange i tr�k
		if (Dices[0] == 6 && Dices[1] == 6 && Dices[2] == 6 && Dices[3] == 6) {
			gameWon();
		}


		// Hvis din score er 40
		if (prevScore >= 40) {

			// Hvis din score er over 40 og hvis du sl�r to �ns som ikke er
			// 1'ere
			if (Dices[0] > 1 && Dices[0] == Dices[1]) {
				gameWon();
			}
		}

		// Hvis du har sl�et to �ns og du ikke har vundet endnu.
		if (Dices[0] == Dices[1] && !won) {
			System.out.println("Du slog to ens! Tryk ENTER for at sl� igen!");

			// Hvis du sl�r par et
			if (Dices[0] == 1 && Dices[1] == 1) {

				// Opdater score efter at variablen lose bliver sat til et
				setLosePoint();
				setTotalScore();
				System.out.println("Oev du mister alle dine point og din score er nu nulstillet");

			}
			// Printer ud her da klassen "Player" kun printer ud hvis du ikke
			// har sl�et to �ns
			print();

			Scanner keyboard = new Scanner(System.in);
			keyboard.nextLine();

			// Her bliver denne variable sat til 1 pga. du har sl�et to ens.
			secondThrow = 1;

		}

	}

	// get til totalscore
	public int gettotalScore() {
		return totalScore;
	}

	// Funktion til at de f�rste kast gemmes
	public void storeData1() {

		Dices[0] = Dice.dice1;
		Dices[1] = Dice.dice2;

	}

	// Funktion til at gemme v�rdierne fra sidste kast
	public void storeData2() {

		Dices[2] = Dices[0];
		Dices[3] = Dices[1];

	}

	public void setTotalScore() {

		score += Dices[0] + Dices[1];
		if (lose == 0)
			totalScore = score;

		if (totalScore >= 40 && lose == 0)
			totalScore = 40;

		// Hvis du sl�r par 1 mister du dine point
		if (lose == 1) {
			score = 0;
			totalScore = 0;
			lose = 0;
		}

	}

	// Accessor set prevScore til score.
	public void setPrevScore() {
		prevScore = score;
	}

	public void setLosePoint() {
		lose = 1;
	}

	public boolean gameWon() {
		won = true;
		return won;
	}

}
