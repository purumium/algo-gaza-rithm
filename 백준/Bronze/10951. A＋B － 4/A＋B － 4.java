import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		while( sc.hasNextInt() ) { // while (sc.hasNextInt())는 입력에 다음 정수가 있는 동안 반복
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);			
		}
	}
}
