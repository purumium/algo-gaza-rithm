import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = 0;
        int col = 0;
        int max = 0;
        
        int[][] matrix = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = sc.nextInt();
                
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((row + 1) + " " + (col + 1));
    }
}