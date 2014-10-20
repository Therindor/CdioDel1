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


package Game;
import Dice.Dice;




public class Player {

	//Opretter et nyt scoreboard til spilleren.
	Scoreboard SB = new Scoreboard();
	
	
	//starter spillet.
	public void Game() {

		
		
		if (!SB.won) {

			//Variable til at tjekke om man har slået 2 éns terninger.
			SB.secondThrow = 0;
			
			//Checker om 
			SB.setPrevScore();
			
			// gemmer gamle kast
			SB.storeData2();

			// Laver et nyt kast
			Dice.rollDice();

			// set Score til at vï¿½r sum af de to nye
			SB.storeData1();

			// Score bliver opdateret med de nye kast.
			SB.setTotalScore();

			// checker terningerne mht. reglerne
			SB.checkThrow();
			
			//Hvis du ikke har slået et par
			if (SB.secondThrow == 0) {
				// printer alle data ud
				SB.print();
			}
			
			//Ellers får spilleren en ny tur ved rekursivt at køre tilbage til begyndelsen af startGame
			else
				Game();

		}
	}
	
	
	//Returnerer won, ligemeget om den er true eller false så Main kan reagere på Won()
	public boolean Won() {
		return SB.won;
	}

}
