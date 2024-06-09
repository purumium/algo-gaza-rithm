import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] piece = {1, 1, 2, 2, 2, 8};

		int[] input = new int[6];
		int[] result = new int[6]; 
		
		for (int i = 0; i < 6; i++) {
			input[i] = sc.nextInt();
			
			// 정해진 개수 - 있는 개수 = 필요한 개수
			result[i] = piece[i] - input[i];
			
			System.out.print(result[i] + " ");
		}
	}
}