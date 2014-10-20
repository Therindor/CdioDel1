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


package TestDice;
import Dice.Dice;



public class TestDice {

	private int rollAmount = 0;

	private final int maxRoll = 1000;
	private int[] sum = new int[11];
	private int[] d = new int[6];

	private int toEns, ikkeToEns;
	public void TestProbability() {
		while (rollAmount <= maxRoll) {
			rollAmount++;
			Dice.rollDice();
			if (Dice.dice1 == 1)
				d[0]++;
			else if (Dice.dice1 == 2)
				d[1]++;
			else if (Dice.dice1 == 3)
				d[2]++;
			else if (Dice.dice1 == 4)
				d[3]++;
			else if (Dice.dice1 == 5)
				d[4]++;
			else if (Dice.dice1 == 6)
				d[5]++;

		}
		System.out.println("1'ere: " + d[0] + ", Som er: " + (float) d[0] / maxRoll * 100 + "%");
		System.out.println("2'ere: " + d[1] + ", Som er: " + (float) d[1] / maxRoll * 100 + "%");
		System.out.println("3'ere: " + d[2] + ", Som er: " + (float) d[2] / maxRoll * 100 + "%");
		System.out.println("4'ere: " + d[3] + ", Som er: " + (float) d[3] / maxRoll * 100 + "%");
		System.out.println("5'ere: " + d[4] + ", Som er: " + (float) d[4] / maxRoll * 100 + "%");
		System.out.println("6'ere: " + d[5] + ", Som er: " + (float) d[5] / maxRoll * 100 + "%\n");
	}

	public void TestSum1to12() {
		
		rollAmount = 0;
		while (rollAmount <= maxRoll) {
			rollAmount++;
			Dice.rollDice();
			int sumDice = Dice.dice1 + Dice.dice2;
			if (sumDice == 2)
				sum[0]++;
			else if (sumDice == 3)
				sum[1]++;
			else if (sumDice == 4)
				sum[2]++;
			else if (sumDice == 5)
				sum[3]++;
			else if (sumDice == 6)
				sum[4]++;
			else if (sumDice == 7)
				sum[5]++;
			else if (sumDice == 8)
				sum[6]++;
			else if (sumDice == 9)
				sum[7]++;
			else if (sumDice == 10)
				sum[8]++;
			else if (sumDice == 11)
				sum[9]++;
			else if (sumDice == 12)
				sum[10]++;
		}
		System.out.println("Antal sum2: " + sum[0] + ", Som er: " + (float) sum[0] / maxRoll * 100 + "%");
		System.out.println("Antal sum3: " + sum[1] + ", Som er: " + (float) sum[1] / maxRoll * 100 + "%");
		System.out.println("Antal sum4: " + sum[2] + ", Som er: " + (float) sum[2] / maxRoll * 100 + "%");
		System.out.println("Antal sum5: " + sum[3] + ", Som er: " + (float) sum[3] / maxRoll * 100 + "%");
		System.out.println("Antal sum6: " + sum[4] + ", Som er: " + (float) sum[4] / maxRoll * 100 + "%");
		System.out.println("Antal sum7: " + sum[5] + ", Som er: " + (float) sum[5] / maxRoll * 100 + "%");
		System.out.println("Antal sum8: " + sum[6] + ", Som er: " + (float) sum[6] / maxRoll * 100 + "%");
		System.out.println("Antal sum9: " + sum[7] + ", Som er: " + (float) sum[7] / maxRoll * 100 + "%");
		System.out.println("Antal sum10: " + sum[8] + ", Som er: " + (float) sum[8] / maxRoll * 100 + "%");
		System.out.println("Antal sum11: " + sum[9] + ", Som er: " + (float) sum[9] / maxRoll * 100 + "%");
		System.out.println("Antal sum12: " + sum[10] + ", Som er: " + (float) sum[10] / maxRoll * 100 + "%\n");
	}
	public void TestPairProbability(){
		rollAmount = 0;
		
		while (rollAmount <= maxRoll){
			rollAmount++;
			Dice.rollDice();
			if (Dice.dice1 == Dice.dice2)
				toEns++;
			else
				ikkeToEns++;
		}
		System.out.println("Antal ens kast: " + toEns + " Som er: " + (float) toEns / maxRoll * 100 + "%");
		System.out.println("Antal ikke ens kast: " + ikkeToEns + " Som er: " + (float) ikkeToEns / maxRoll * 100 + "%");
	}

}
