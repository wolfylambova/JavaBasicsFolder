import java.util.Scanner;

public class _2_AddingAngles {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		int[] angles = new int[n];
		for (int i = 0; i < angles.length; i++) {
			angles[i] = input.nextInt();
		}

		boolean isTrue = false;
		for (int a = 0; a < angles.length; a++) {
			for (int b = 0; b < angles.length; b++) {
				for (int c = 0; c < angles.length; c++) {
					int sum = angles[a] + angles[b] + angles[c];
					if (sum % 360 == 0) {
//						System.out.println("" + angles[a] + "+" + angles[b]
//								+ "+" + angles[c] + "=" + sum + "degrees");
						System.out.printf("%d + %d +%d = %d degrees%n", angles[a], angles[b], angles[c], sum);
					} else {
						isTrue = true;
					}
				}
			}
		}
		if (!isTrue) {
			System.out.println("No");
		}

	}
}
