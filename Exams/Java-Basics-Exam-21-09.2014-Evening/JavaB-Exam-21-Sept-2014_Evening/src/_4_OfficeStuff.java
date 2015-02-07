import java.util.Scanner;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class _4_OfficeStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.nextLine());

		TreeMap<String, LinkedHashMap<String, Integer>> output = new TreeMap<String, LinkedHashMap<String, Integer>>();

		for (int i = 0; i < n; i++) {
			String[] input = scn.nextLine().split(" - ");
			String company = input[0].substring(1, input[0].length()); // from the 1st because zero index is '|'
																
			int amount = Integer.parseInt(input[1]);
			String product = input[2].substring(0, input[2].length()-1);

			if (!output.containsKey(company)) { // ако не се съдържа го добавяме
					output.put(company, new LinkedHashMap<String, Integer>());
			}
			if (!output.get(company).containsKey(product)) {
					output.get(company).put(product, amount);
				}
			else {
					int currentAmount = output.get(company).get(product);
					currentAmount += amount;
					output.get(company).put(product, currentAmount);
				}
			}
		
		
		for (String company : output.keySet()) {
			System.out.printf("%s: ", company);
			int indexCounter = 1; // заради изискването за запетая
			for (String product : output.get(company).keySet()) {
				System.out.printf("%s-%d", product,output.get(company).get(product));
				if (indexCounter < output.get(company).size()) {
				System.out.printf(", ");
				indexCounter++;
				}
				else System.out.println();
			}
			
		}
		}
	}


