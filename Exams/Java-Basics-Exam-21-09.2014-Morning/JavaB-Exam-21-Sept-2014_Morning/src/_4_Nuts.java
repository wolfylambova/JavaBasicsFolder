import java.util.Scanner;
import java.util.TreeMap;

public class _4_Nuts {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());

		TreeMap<String, TreeMap<String, Integer>> output = new TreeMap<String, TreeMap<String, Integer>>();

		for (int i = 0; i < n; i++) {
			String[] line = input.nextLine().split(" ");
			String company = line[0];
			String nuts = line[1];
			int amount = Integer.parseInt(line[2].substring(0, line[2].length()-2));
			
			if (!output.containsKey(company)) {
				output.put(company, new TreeMap<String, Integer>());
			}
			output.get(company).put(nuts, amount);
			if (output.get(company).containsKey(nuts)) {
				amount+=amount;
			}
			
			else{
				output.get(company).put(nuts, amount);
			}
			
		}

		for (String company : output.keySet()) {
			String result = company + ": ";
			TreeMap<String, Integer> innerMap = output.get(company);
			for (String innerKey : innerMap.keySet()) {
				result += String.format("%s-%dkg, ", innerKey, innerMap.get(innerKey));

			}
			System.out.println(result.substring(0, result.length()-2));
			
		}
	

	}
}
