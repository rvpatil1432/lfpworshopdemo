package lfpworkshop.lfpworkshop;

import java.util.Scanner;

public class GamblerSimulator {
	public static void main(String[] args) {
		int bets = 1;
		int stake  = 100;
		int goal   = 1000;
		int wins = 0;      

		System.out.println("Enter number of trails..");
		Scanner sc = new Scanner(System.in);
		int trials = sc.nextInt();
		GamblerSimulator game = new GamblerSimulator();
		game.calculateWinLose(trials,stake,goal,bets,wins);


	}
	/*
	 * UC-1
	 */
	public void calculateWinLose(int trials,int stake,int goal,int bets,int wins ) 
	{

		for (int t = 0; t < trials; t++) {

			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) { cash++;   
				System.out.println("Win");}
				else {                    cash--;   
				System.out.println("lose");
				}
			}
			if (cash == goal) wins++;                
		}

		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);
	}
}
