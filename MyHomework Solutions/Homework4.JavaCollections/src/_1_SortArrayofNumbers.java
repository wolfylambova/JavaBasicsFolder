import java.util.ArrayList;
import java.util.Scanner;
public class _1_SortArrayofNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arrayNums = new int[n];
		boolean swapped = true;
		
		for (int i = 0; i < arrayNums.length; i++) {
			arrayNums[i] = input.nextInt();
		}
	
		do {
			swapped = false;
			for (int i = 0; i < arrayNums.length - 1; i++) {
				if (arrayNums[i] > arrayNums[i+1]) {

					int recurseHelp = arrayNums[i+1];
				    arrayNums[i+1] = arrayNums[i];
				    arrayNums[i] = recurseHelp;
					swapped = true;
				}
			}
		} while (swapped);

		for (int i = 0; i < arrayNums.length; i++) {
			System.out.print(arrayNums[i]+" ");
		}
	}

}
