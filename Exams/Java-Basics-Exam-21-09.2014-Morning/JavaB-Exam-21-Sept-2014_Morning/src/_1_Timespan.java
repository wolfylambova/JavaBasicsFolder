import java.util.Arrays;
import java.util.Scanner;

public class _1_Timespan {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);	
		
		long beginSeconds = makeTimeToSeconds();
		long endSeconds = makeTimeToSeconds();
		long timeLeft = beginSeconds - endSeconds;
		int seconds = (int)(timeLeft % 60);
		int minutues = (int)(timeLeft % 3600 / 60);
		int hours = (int)(timeLeft / 3600);
		System.out.printf("%d:%s:%s", 
				hours, 
				minutues < 10 ? "0" + minutues : "" + minutues, 
				seconds < 10 ? "0" + seconds : "" + seconds);		
	}
	
	public static long makeTimeToSeconds() {
		String[] splitedString = input.nextLine().split(":");
		return Long.parseLong(splitedString[2]) +
				(Long.parseLong(splitedString[1]) * 60) +
				(Long.parseLong(splitedString[0]) * 3600);
	}
}



//import java.util.Date;
//import java.util.Scanner;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//
//public class _1_ {
//
//	public static void main(String[] args) throws ParseException {
//		
//		Scanner input = new Scanner(System.in);
//		SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm:s");
//		String firstDate = input.nextLine();
//		String secondDate = input.nextLine();
//		Date first  = dateFormat.parse(firstDate);
//		Date second  = dateFormat.parse(firstDate);
//
//		long millsZeroHour = dateFormat.parse("0:00:00").getTime();
//		long diffFirstDate = first.getTime() - millsZeroHour;
//		long diffSecondDate = second.getTime() - millsZeroHour;
//		long outputDate = diffSecondDate - diffFirstDate;
//		
//		System.out.printf("%d.02", outputDate);
//	}
//
//}
