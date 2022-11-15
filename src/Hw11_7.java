/*
1 2 3 4 5 6 7 8 9 0
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Hw11_7 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create an ArrayList of Integer type
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter a list of Integer ending with 0
		System.out.print("Enter a list of integers ending with 0: ");
		Integer number = input.nextInt();

		while (number.intValue() != 0) {
			list.add(number);
			number = input.nextInt();
		}

		// Invoke shuffle method
		shuffle(list);

		// Display shuffled list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		input.close();
	}

	/** Shuffles the elements in an ArrayList of integers */
	public static void shuffle(ArrayList<Integer> list) {
		java.util.Collections.shuffle(list);
	}
}