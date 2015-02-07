import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
public class _3_ValidUsernames {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		line = line.replace("/", " ");
		line = line.replace("\\", " ");
		line = line.replace("(", " ");
		line = line.replace(")", " ");
		
		String[] usernames =  line.split("\\s+");
		ArrayList<String> validUserNames = new ArrayList<String>();
			
		
		for (String user : usernames) {
			if (user.matches("[A-Za-z0-9_]{3,25}") && user.matches("[A-Za-z](.*)")) {
				validUserNames.add(user);
			}
		}
		
		int maxLength = 0;
		String[] output = new String[2];
		for (int i = 0; i < validUserNames.size()-1; i++) {
			String strA = validUserNames.get(i);
			String strB = validUserNames.get(i+1);
			int lengthA = strA.length();
			int lengthB = strB.length();
			if (maxLength<lengthA+lengthB) {
				maxLength = lengthA+lengthB;
				output[0]=strA;
				output[1]=strB;
			}
		}
		System.out.printf("%s\n%s", output[0], output[1]);
		

	}

}
