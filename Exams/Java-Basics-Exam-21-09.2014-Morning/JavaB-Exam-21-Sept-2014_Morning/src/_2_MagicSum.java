import java.util.ArrayList;
import java.util.Scanner;


public class _2_MagicSum {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int divide = Integer.parseInt(input.nextLine());
		String firstline = input.nextLine();
		ArrayList<Integer> nums = new ArrayList<>();
		ArrayList<Integer> numsDivided = new ArrayList<>();
		ArrayList<Integer> sums = new ArrayList<>();
		int sumThree = 0;
		while (!firstline.equals("End")) {
			int num = Integer.parseInt(firstline);
			nums.add(num);
			firstline = input.nextLine();

		}
		int zeroIndexSums = Integer.MIN_VALUE;
		sums.add(zeroIndexSums);
		sums.add(zeroIndexSums);

		for (int i = 0; i < nums.size() - 2; i++) {
			for (int j = i+1; j < nums.size() - 1; j++) {
				for (int k = j+1; k < nums.size(); k++) {

					sumThree = nums.get(i) + nums.get(j) + nums.get(k);

					if (sumThree % divide == 0
							&& (sumThree > sums.get(sums.size() - 1)) ) {
						numsDivided.removeAll(numsDivided);

						numsDivided.add(nums.get(i));
						numsDivided.add(nums.get(j));
						numsDivided.add(nums.get(k));

						sums.removeAll(sums);
						sums.add(sumThree);

					}
				}
			}
		}
		if (!numsDivided.isEmpty()) {
			int one = numsDivided.get(0);
			int two = numsDivided.get(1);
			int three = numsDivided.get(2);

			System.out.println("(" + one + " + " + two + " + " + three + ")"
					+ " % " + divide + " = 0");
		} else {
			System.out.println("No");
		}

	}
}
