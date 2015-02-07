import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long firstNum = Long.parseLong(scanner.nextLine().trim());

        ArrayList<Long> outputNums = new ArrayList<Long>();
        outputNums.add(firstNum);

        for (int i = 1; i < n; i++) {
            String[] nums = scanner.nextLine().trim().split("\\s+");


            long smallestDifference = Integer.MAX_VALUE;
            long smallestNum = Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                long currentNum = Long.parseLong(nums[j]);

                if (currentNum - firstNum > 0) {
                    if(currentNum - firstNum < smallestDifference) {
                        smallestDifference = currentNum - firstNum;
                        smallestNum = currentNum;
                    }
                }
            }

            if (smallestNum != Integer.MAX_VALUE) {
                outputNums.add(smallestNum);
                firstNum = smallestNum;
            } else {
                firstNum++;
            }
        }
        String output = outputNums.toString();
        output = output.substring(1, output.length()-1);
        System.out.println(output);
    }
}