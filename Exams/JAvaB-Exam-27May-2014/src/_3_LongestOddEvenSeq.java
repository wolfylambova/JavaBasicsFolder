	import java.util.ArrayList;
	import java.util.Scanner;
	// THIS SOLUTION GIVES ONLY 80 PERCENTAGE(points) !!!!!!!!!!!	
	public class _3_LongestOddEvenSeq {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	
			String line = input.nextLine();
			String[] numsStrArr = line.split("[^-\\d]+");
			ArrayList<Integer> numsInt = new ArrayList<>();
	
			for (int i = 0; i < numsStrArr.length; i++) {
				if (!numsStrArr[i].equals("")) {
					numsInt.add(Integer.parseInt(numsStrArr[i]));
				}
			}
	
			
			int maxLen = 1;
			int currentLen = 1;
	
			for (int i = 0; i < numsInt.size() - 1; i++) {
				int current = numsInt.get(i);
				int next = numsInt.get(i + 1);
				
				if ((current % 2 == 0 || current == 0)
						&& (next % 2 != 0 || next == 0)) {
					currentLen++;
	
				} else if ((current % 2 != 0 || current == 0)
						&& (next % 2 == 0 || next == 0)) {
					currentLen++;
				} else {
					currentLen = 1;
				}
	
				if (currentLen > maxLen) {
					maxLen = currentLen;
	
				}
			}
			System.out.println(maxLen);
		}
	}