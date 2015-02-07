import java.util.Scanner;
import java.util.TreeMap;

public class _4_Tracker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();

		TreeMap<Integer, TreeMap<String, Integer>> info = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			String[] line = input.nextLine().trim().split("[\\/ ]+");
			int month = Integer.parseInt(line[1]);
			String name = line[3];
			int distance = Integer.parseInt(line[4]);

			if (!info.containsKey(month)) {
				info.put(month, new TreeMap<>());
			}
			TreeMap<String, Integer> personinfo = info.get(month);
			int OldDistance = 0;

			if (personinfo.containsKey(name)) {
				OldDistance = personinfo.get(name);
			}
			personinfo.put(name, OldDistance + distance);

		}
		for (Integer month : info.keySet()) {
			System.out.printf(month + ":");
			System.out.println(info.get(month).toString().replace("{", "")
					.replace("=", "(").replace(",", "),").replace("}", ")"));
			
		}
	}
}
