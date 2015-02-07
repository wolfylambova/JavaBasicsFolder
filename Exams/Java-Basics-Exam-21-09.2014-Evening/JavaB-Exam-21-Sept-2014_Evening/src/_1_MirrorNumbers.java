import java.util.Scanner;
public class _1_MirrorNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			scn.nextLine();
			
			String[] numbers = scn.nextLine().split("\\s+");
			
			boolean match=false;
			
			for (int i = 0; i < numbers.length-1; i++) {
				for (int j = i+1; j < numbers.length; j++) {
					String reversedNextNumber = new StringBuffer(numbers[j]).reverse().toString();
					
					if (numbers[i].equals(reversedNextNumber)) {
						System.out.println(numbers[i]+"<!>"+numbers[j]);
						match =true;
					}
				}
			}
			if (!match) {
				System.out.println("No");
			}
			
	}

}
