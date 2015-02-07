import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Pattern pat = Pattern.compile("\\|(.*?)\\|");
        Matcher match = pat.matcher(line);

        while (match.find()) {
            String bomb = match.group(1);
            int bombSize = 0;
            for (int i = 0; i < bomb.length(); i++) {
                bombSize += bomb.charAt(i);
            }
            bombSize %= 10;

            String regex =
                    ".{0," + bombSize +
                            "}\\|(.*?)\\|.{0," +
                            bombSize + "}";
            Pattern bombAreaPat = Pattern.compile(regex);
            Matcher bombAreaMatch = bombAreaPat.matcher(line);

            boolean foundTheArea = bombAreaMatch.find();

            if (foundTheArea) {
                String area = bombAreaMatch.group();
                String dots = area.replaceAll(".", "\\.");

                line = line.replace(area, dots);
            }
        }

        System.out.print(line);
    }
}
