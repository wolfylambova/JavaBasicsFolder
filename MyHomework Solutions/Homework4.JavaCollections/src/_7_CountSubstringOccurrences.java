import java.util.Scanner;
public class _7_CountSubstringOccurrences {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);   
		String text = input.nextLine().toLowerCase();
		String pattern = input.nextLine().toLowerCase();
		int count = 0;
		
		String[] words =  text.split("\\W+");
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(pattern)) {
				count++;
			}
		}
		
		System.out.println(text.substring(text.length()-1, text.length()));
		System.out.println(count);

	}

}
