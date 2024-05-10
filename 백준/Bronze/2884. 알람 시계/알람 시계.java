import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if( 1 <= a && a <= 23 ) {
			if( b >= 45 ) {
				System.out.println( a + " " + (b - 45) );
			} else {
				System.out.println( (a - 1) + " " + ( 15 + b )  );
			}
		}
		else { // a = 0 인 경우
			if( b >= 45 ) {
				System.out.println( a + " " + (b - 45) );
			} else {
				System.out.println( 23 + " " + ( 15 + b ) );
			}
		}
	}
}
