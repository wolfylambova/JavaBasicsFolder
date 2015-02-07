import java.util.Scanner;
public class _2_SequencesofEqualStrings {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String line = scn.nextLine();
		String[] words = line.split(" ");
	
		System.out.print(words[0]);
		for (int i = 1; i < words.length; i++) {
	
			if (words[i].equals(words[i-1])) {
				System.out.print(" " + words[i]);
			}
			else {
				System.out.println();
				System.out.print(words[i]);
			}
		}
	}
}
