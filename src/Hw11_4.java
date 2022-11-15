/*
1 9 2 8 3 7 4 6 5 0
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Hw11_4 {
	// Main method
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter a sequence of numbers ending with 0
		System.out.print("Enter a sequence of numbers ending with 0: ");
		Integer number = input.nextInt();
		while (number.intValue() != 0) {
			list.add(number);
			number = input.nextInt();
		}

		input.close();

		// Display the largest number in the input 
		System.out.println("The largest number in the input is " + max(list));
	}

	/** Return the maximum value in an ArrayList of integers */
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0)
			return null;

		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}
}