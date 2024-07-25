import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		// 입력 받는 수가 1인 경우에는 아무 것도 출력하지 않음		
		if( num != 1 ) {

			// 1. 어떤 수를 2로 나누었을 때, 나누어 떨어지는지 보기
			while( num % 2 == 0 ) {  // 몇 번을 나눌지 모르니까, while문
				System.out.println(2 + " ");
				num /= 2; // n/2의 몫을 num에 재할당
			}

			// 2. 3부터는 홀수로 체크하기(소수에서는 2만 짝수)
			for(int i = 3; i <= Math.sqrt(num); i += 2 ) {			
				while(num % i == 0) {  // 몇 번을 나눌지 모르니까, while문
					System.out.println(i + " ");
					num /= i;  // n/2의 몫을 num에 재할당
				}
			}
		} else {  // 입력 받는 수가 1인 경우, 아무것도 출력하지 않음
			System.out.println(" ");
		}
		
        // num에 남은 수가 있으면 출력(2 이상이면 소수)
		if( num > 2 ) {
			System.out.println(num);
		}
		sc.close();
	}
}