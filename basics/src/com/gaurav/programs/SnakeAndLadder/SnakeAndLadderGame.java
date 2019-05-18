package com.gaurav.programs.SnakeAndLadder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadderGame {

	public static final int WINPOINT = 100;
	Map<Integer, Integer> snakes = new HashMap<Integer, Integer>();
	Map<Integer, Integer> ladders = new HashMap<Integer, Integer>();

	static int posOfPlayer1, posOfPlayer2 = 0;

	public void play() {
		Scanner sc = new Scanner(System.in);
		String r = null;
		int diceValue;
		int currentPlayer = -1;

		setup();

		do {
			if (currentPlayer == -1) {
				System.out.println("Palyer 1 will roll the dice");
				r = sc.next();
				diceValue = getDiceValue();

				posOfPlayer1 = completePlayersTurn(diceValue, posOfPlayer1, "PLAYER 1");

				System.out.println("Player 1" + " is at " + posOfPlayer1);

				if (posOfPlayer1 == WINPOINT) {
					System.out.println("Player 1 Wins ");
					return;
				}
			} else {
				System.out.println("Palyer 2 will roll the dice");
				r = sc.next();
				diceValue = getDiceValue();

				posOfPlayer2 = completePlayersTurn(diceValue, posOfPlayer2, "PLAYER 2");

				System.out.println("Player 2" + " is at " + posOfPlayer2);

				if (posOfPlayer2 == WINPOINT) {
					System.out.println("Player 2 Wins ");
					return;
				}
			}

			currentPlayer = -currentPlayer;

		} while (r.equals("r"));

	}

	private int completePlayersTurn(int diceValue, int posOfPlayer, String playerID) {

		posOfPlayer = posOfPlayer + diceValue;

		if (null != snakes.get(posOfPlayer)) {
			posOfPlayer = snakes.get(posOfPlayer);
			System.out.println(playerID + "Swallowed by Snake");

		}

		if (null != ladders.get(posOfPlayer)) {
			posOfPlayer = ladders.get(posOfPlayer);
			System.out.println(playerID + "Climbed up the ladder");
		}

		return posOfPlayer;

	}

	private int getDiceValue() {
		int n = 0;
		Random random = new Random();
		n = random.nextInt(7);
		return (n == 0 ? 1 : n);
	}

	private void setup() {
		initializeSnakes();
		initializeLadders();
	}

	private void initializeLadders() {
		ladders.put(4, 11);
		ladders.put(15, 32);
		ladders.put(25, 32);
		ladders.put(42, 55);
		ladders.put(66, 73);
		ladders.put(71, 92);
	}

	private void initializeSnakes() {
		snakes.put(20, 2);
		snakes.put(37, 13);
		snakes.put(44, 26);
		snakes.put(59, 18);
		snakes.put(83, 61);
		snakes.put(99, 3);
	}

}
