import java.util.ArrayList;
import java.util.Scanner;
public class _6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);   
		String text = input.nextLine().toLowerCase();
		String pattern = input.nextLine().toLowerCase();
		int count = 0;
		
		String[] words =  text.split("\\W+");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(pattern)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
