import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.monitor.CounterMonitorMBean;
public class _8_ExtractEmails {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] textsplitted = text.split("\\s+");
		Pattern pattern = Pattern.compile("[A-Za-z0-9\\._-]+@[A-Za-z0-9\\.-]+\\.[A-Za-z]{2,4}");
		Matcher matcher = pattern.matcher(text);
		ArrayList<String> emails = new ArrayList<>();
		
		for (String word : textsplitted) {
			if (pattern.matches("[A-Za-z0-9\\._-]+@[A-Za-z0-9\\.-]+\\.[A-Za-z]{2,4}", word)) {
				emails.add(word);
			}
		}
		for (String string : emails) {
			System.out.println(string);
		}
		

	}
}


