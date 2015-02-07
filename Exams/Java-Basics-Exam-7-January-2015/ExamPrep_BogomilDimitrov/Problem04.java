import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, TreeMap<String, ArrayList<Integer>>> students =
                new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0] + " " + data[1];
            String subject = data[2];
            int grade = Integer.parseInt(data[3]);

            if (!students.containsKey(name)) {
                students.put(name, new TreeMap<>());
                students.get(name).put(subject,
                        new ArrayList<Integer>() {{
                        add(grade);}});
            } else {
                if (students.get(name).containsKey(subject)) {
                    students.get(name).get(subject).add(grade);
                } else {
                    students.get(name).put(subject,
                            new ArrayList<Integer>() {{
                            add(grade);}});
                }
            }
        }


        for (String student : students.keySet()) {
            System.out.print(student + ": [");
            String output = "";
            for (String subject : students.get(student).keySet()) {
                output += subject + " - ";
                double avgGrade = 0;
                for (int i = 0; i < students.get(student).get(subject).size(); i++) {
                     avgGrade += students.get(student).get(subject).get(i);
                }

                avgGrade /= (double)students.get(student).get(subject).size();
                output += String.format("%.2f, ", avgGrade);
            }
            System.out.println(output.substring(0, output.length()-2) + ']');
        }
    }
}