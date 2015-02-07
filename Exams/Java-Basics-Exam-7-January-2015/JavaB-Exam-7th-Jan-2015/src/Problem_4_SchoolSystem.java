import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem_4_SchoolSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lines = Integer.parseInt(input.nextLine());
		TreeMap<String, TreeMap<String, ArrayList<Double>>> names = new TreeMap<>();
		for (int i = 0; i < lines; i++) {
			String[] data = input.nextLine().split("\\s+");
			String name = data[0] + " " + data[1];

			if (names.containsKey(name)) {
				TreeMap<String, ArrayList<Double>> subjects = names.get(name);
				String subject = data[2];
				if (subjects.containsKey(subject)) {
					ArrayList<Double> grades = subjects.get(subject);
					grades.add(Double.parseDouble(data[3]));
					subjects.put(subject, grades);
					names.put(name, subjects);
				} else {
					ArrayList<Double> grades = new ArrayList<>();
					grades.add(Double.parseDouble(data[3]));
					subjects.put(subject, grades);
					names.put(name, subjects);
				}
			} else {

				TreeMap<String, ArrayList<Double>> subjects = new TreeMap<>();
				String subject = data[2];
				ArrayList<Double> grades = new ArrayList<>();
				grades.add(Double.parseDouble(data[3]));
				subjects.put(subject, grades);
				names.put(name, subjects);
			}
		}
		for (Entry<String, TreeMap<String, ArrayList<Double>>> name : names
				.entrySet()) {
			System.out.printf("%s: [", name.getKey());
			TreeMap<String, ArrayList<Double>> subjects = name.getValue();
			int neededCommas = -1;
			int currentCommas = 0;
			for (Entry<String, ArrayList<Double>> subject : subjects.entrySet()) {
				neededCommas++;
			}
			for (Entry<String, ArrayList<Double>> subject : subjects.entrySet()) {
				int len = subject.getValue().size();
				ArrayList<Double> grades = subject.getValue();
				int sum = 0;
				for (int i = 0; i < len; i++) {
					sum += grades.get(i);
				}
				double average = (double) sum / len;
				if (neededCommas == currentCommas) {
					System.out.printf("%s - %.2f]\n", subject.getKey(), average);
				}
				else {
					System.out.printf("%s - %.2f, ", subject.getKey(), average);
				}
				currentCommas++;
			}
		}
	}

}