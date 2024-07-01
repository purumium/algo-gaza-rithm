import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * 2;
		}
		
		int result = (sum + 1)*(sum + 1);
		System.out.println(result);			
	}
}
