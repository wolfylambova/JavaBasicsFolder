import java.util.Scanner;
import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Problem_3_SpiralMatrix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		String text = input.nextLine().toLowerCase();
		
		char[][]  matrix = new char[n][n];
		int matrixRotations = n*n;
		int col = 0;
		int row=0;
		String direction = "right";
		
		ArrayList<Character> textMatrix = new ArrayList<Character>();
		
		for (int i = 0; i < n; i++) {
			for (char letterFromInput : text.toCharArray()) {
				  textMatrix.add(letterFromInput);
				}
			
//			for (int j = 0; j < text.length(); j++) {
//				char letterFromInput = text.charAt(i);
//					textMatrix.add(letterFromInput);
//			}
		}
		
		for (int i = 1; i <= matrixRotations; i++) {
			
			char currentLetter = textMatrix.get(i);
			matrix[row][col] = currentLetter;
			
			
			//define when the direction has to be changed
			if (direction == "right" && (col>n-1 || matrix[row][col] != '\u0000')) { //default value of char in java
				direction = "down";
				row++;		
				col--;
			}
			
			if (direction == "down" && (row>n-1 || matrix[row][col] != '\u0000')) {
				direction = "left";
				col--;
				row--;
			}
			if (direction == "left" && (col<0 || matrix[row][col] !='\u0000')) {
				direction = "up";
				row--;
				col++;
			}
			if (direction == "up" && (row<0 || matrix[row][col] != '\u0000')) {
				direction = "right";
				row++;
				col++;
			}
			
			//actions for the directions
			if (direction == "right") {
				col++;
			}
			if (direction == "down") {
				row++;
			}
			if (direction == "left") {
				col--;
			}
			if (direction == "up") {
				row--;
			}
		}
		System.out.println(matrix);
	}

}
