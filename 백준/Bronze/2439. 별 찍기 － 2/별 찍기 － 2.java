import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			
			for (int i = 1; i <= count; i++) {	
                for (int j = 1; j <= count - i; j++) { // 공백 = count - i 
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) { // k <= i
                    System.out.print("*");
                }
                System.out.println();
			}		
	}
}