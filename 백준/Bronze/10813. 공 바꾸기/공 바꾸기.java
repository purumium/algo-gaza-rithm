import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니의 개수
        
        // 각 바구니에는 바구니 번호와 같은 번호의 ball이 들어가 있음
        int[] baskets = new int[N];
        for (int i = 0; i < baskets.length; i++) {
			baskets[i] = (i + 1);  
		}
        
        int M = sc.nextInt(); // 공을 바꿀 횟수
        
        // 각 바구니를 선택하여, 바구니의 공을 교환함
        for (int m = 1; m <= M; m++) {
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	
			int temp = baskets[num1 - 1];
			baskets[num1 - 1] = baskets[num2 - 1];
			baskets[num2 - 1] = temp;		
		}
        
        // 바구니의 상태 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }	
	}
}