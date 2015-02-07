import java.util.Scanner;

public class Problem_3_FireTheArrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][];

        for (int i = 0; i < n; i++){
            matrix[i] = scanner.nextLine().toCharArray();
        }

        boolean hasMoved;

        do {
            hasMoved = false;
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    switch (matrix[row][col]) {
                        case '>':
                            if (col + 1 > matrix[row].length - 1) {
                                break;
                            }
                            if (matrix[row][col + 1] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row][col + 1] = '>';
                                hasMoved = true;
                            }
                            break;
                        case '<':
                            if (col - 1 < 0) {
                                break;
                            }
                            if (matrix[row][col - 1] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row][col - 1] = '<';
                                hasMoved = true;
                            }
                            break;
                        case '^':
                            if (row - 1 < 0) {
                                break;
                            }
                            if (matrix[row - 1][col] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row - 1][col] = '^';
                                hasMoved = true;
                            }
                            break;
                        case 'v':
                            if (row + 1 > matrix.length - 1) {
                                break;
                            }
                            if (matrix[row + 1][col] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row + 1][col] = 'v';
                                hasMoved = true;
                            }
                            break;
                    }
                }
            }
        } while (hasMoved);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
