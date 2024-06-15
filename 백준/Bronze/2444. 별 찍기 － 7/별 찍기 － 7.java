import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 1; i < 2*n ; i++) {
			int stars;
			int spaces;
			
			if(i <= n) {
				stars = 2*i - 1;  // 별 1, 3, 5, 7, 9
				spaces = n - i;  // 4, 3, 2, 1
			}
			else { // 6, 7, 8, 9
				stars = 2*(2*n-i) - 1;  // 별은 7, 5, 3, 1
				spaces = i - n;   // 1, 2, 3, 4
			}
			
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}