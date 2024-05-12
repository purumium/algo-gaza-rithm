import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 1.같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금.
		// 2.같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금
		// 3.모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금
		
		if ( a == b && b == c ) {
			System.out.println(10000 + a*1000);
		} else if ( a == b || b == c || c == a ) {
			int equalNum = ( a == b ) ? a : ( b == c ) ? b : c;
			System.out.println( 1000 + equalNum*100 );
		} else {
			int max = a > b  ?  ( a > c ? a : c ) : ( b > c ? b : c ) ;
			System.out.println( max * 100 );
		}
	}
}