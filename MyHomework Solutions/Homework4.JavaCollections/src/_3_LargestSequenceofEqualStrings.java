import java.util.ArrayList;
import java.util.Scanner;

public class _3_LargestSequenceofEqualStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] arrayStr = line.split("[\\s+]");
		int maxCount = 1;
		int indexOfMaxElement = 0;

		for (int i = 0; i < arrayStr.length - 1; i++) {
			int currentCount = 1;
			String currentElement = arrayStr[i];

			while (i < arrayStr.length - 1
					&& currentElement.equals(arrayStr[i + 1])) {
				currentCount++;
				i++;
			}

			if (currentCount > maxCount) {
				maxCount = currentCount;
				i--;
				indexOfMaxElement = i;
			}
		}

		for (int i = 0; i < maxCount; i++) {
			System.out.printf("%s ", arrayStr[indexOfMaxElement]);
		}

	}

}
