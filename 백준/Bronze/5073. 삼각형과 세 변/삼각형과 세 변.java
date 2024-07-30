import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] a = new int[3];

		while( true ) {
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			a[2] = sc.nextInt();

			Arrays.sort(a);  // 오름차순

			if(a[0] == 0) break;  // 0인 경우에는 while문 수행하지 않음

			// 1. 세 변의 길이가 모두 같은 경우
			// 2~3의 경우는, a + b > c인지를 체크해야 함(삼각형 조건 확인)
			// 2. 2개만 같은 경우
			// 3. 모두 다른 경우

			if( a[0] == a[1] && a[1] == a[2] ) {  // 셋 다 같은 경우
				System.out.println("Equilateral");
			} else if ( a[0] != a[1] && a[1] != a[2] && a[2] != a[0]) {  // 모두가 다른 경우
				if( a[0] + a[1] > a[2] ) {
					System.out.println("Scalene");
				} else {
					System.out.println("Invalid");
				}	
			} else {  // 2개만 같은 경우
				if( a[0] + a[1] > a[2] ) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Invalid");
				}
			}
		}

		sc.close();
	}
}