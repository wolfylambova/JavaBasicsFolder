import java.util.Arrays;
import java.util.Scanner;

public class _2_PossibleTringles {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String inputLine = scn.nextLine();
		boolean resultsFound = false;

		while (!inputLine.equals("End")) {
			String[] numbersAsStrings = inputLine.split("\\s+");
			double[] numbers = new double[3];

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = Double.parseDouble(numbersAsStrings[i]);
			}

			Arrays.sort(numbers);

			if (numbers[0] + numbers[1] > numbers[2]) {
				System.out.printf("%.2f+%.2f>%.2f%n", 
						numbers[0], numbers[1],numbers[2]);

				resultsFound = true;
			}
			inputLine = scn.nextLine();
		}

		if (!resultsFound) {
			System.out.println("No");

		}
	}
}
