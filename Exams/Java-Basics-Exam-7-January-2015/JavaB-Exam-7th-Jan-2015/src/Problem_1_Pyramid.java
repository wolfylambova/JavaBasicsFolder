import java.util.ArrayList;
import java.util.Scanner;
public class Problem_1_Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.nextLine());
		int firstNum = Integer.parseInt(input.nextLine().trim());
		ArrayList<Integer> outputNums = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			String[] nums = input.nextLine().trim().split("\\s+");
			int closestNum = Integer.MAX_VALUE;
			int smallestDiff = Integer.MAX_VALUE;
			
			
			boolean hasBigger = false;
			for (int j = 0; j < nums.length; j++) {
				int currentNum = Integer.parseInt(nums[j]);
				if (currentNum>firstNum) {
					int currentDiff = currentNum - firstNum;
					if (smallestDiff > currentDiff) {
						smallestDiff = currentDiff;
						closestNum = currentNum;
						hasBigger = true;
				}
				}
				
			}
			if (!hasBigger) {
				firstNum++;
			}
			else {
				outputNums.add(closestNum);
				firstNum  = closestNum;
			}
		}
		System.out.println(outputNums.toString()); 
	}

}
