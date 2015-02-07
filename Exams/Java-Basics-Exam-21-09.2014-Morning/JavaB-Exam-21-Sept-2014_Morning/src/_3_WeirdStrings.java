import java.util.ArrayList;
import java.util.Scanner;

public class _3_WeirdStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String lineInput = input.nextLine().replaceAll(
				"\\s+|\\(|\\)|\\/|\\||\\\\", ""); // or "[\\\\/\\(\\)\\|\\s+]* "
		String[] lineWords = lineInput.split("[^A-Za-z]+");
		int position1 = 0;
		int position2 = 0;
		int maxSum = 0;
		int sumTwoWords = 0;

		for (int i = 0; i < lineWords.length - 1; i++) {
			char[] charArr1 = lineWords[i].toLowerCase().toCharArray();
			char[] charArr2 = lineWords[i + 1].toLowerCase().toCharArray();
			for (int j = 0; j < charArr1.length; j++) {
				sumTwoWords += (int) charArr1[j] - 96;
			}
			for (int j = 0; j < charArr2.length; j++) {
				sumTwoWords += ((int)charArr2[j]) - 96;
			}
			if (sumTwoWords >= maxSum) {
				maxSum = sumTwoWords;
				position1 = i;
				position2 = i + 1;
			}
			sumTwoWords = 0;

		}
		System.out.println(lineWords[position1]);
		System.out.println(lineWords[position2]);
	}
}
