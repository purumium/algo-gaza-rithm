import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int count = sc.nextInt();
		
		int totalSum = 0;
		for (int i = 0; i < count; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			
			totalSum += price * num; 
		}
		if( totalSum == total ) System.out.println("Yes"); 
		else System.out.println("No");
	}
}