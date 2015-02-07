import java.util.ArrayList;
import java.util.Scanner;
public class _5_CountAllWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);   
		String text = input.nextLine();
		String[] words =  text.split("\\s+");
		ArrayList<String> wordsOnly = new ArrayList<String>();

		int count = words.length;
		System.out.println(count);
	}
	
//	private static String readString()
//	{
//		Scanner input = new Scanner(System.in);
//	    String s = "";
//	    while(input.hasNext())
//	    s += input.nextLine();   
//	    return s;
//	} 

}
