import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] stick = new int[3];

		for (int i = 0; i < stick.length; i++) {
			stick[i] = sc.nextInt();
		}

		// 배열을 오름차순으로 정렬
		// a + b > c
		Arrays.sort(stick);

		// a + b > c 
		// a + c > c
		// b + c > a 
		// 가장 긴 변이 다른 두 변을 더한 것 보다 더 커야 함(1 + 2 = 3 > 6)
		while( stick[0] + stick[1] <= stick[2] ) {
			stick[2]--;
		} 

		System.out.println( stick[0] + stick[1] + stick[2] );

		sc.close();
	}
}