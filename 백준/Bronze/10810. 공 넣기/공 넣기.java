import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니의 개수
        int M = sc.nextInt(); // 공을 넣는 횟수

        int[] baskets = new int[N]; // 바구니는 N개, N개 바구니에 공(ball) 넣기
     
        for (int m = 0; m < M; m++) { // M개만큼 공 넣는 방법이 주어짐
            int start = sc.nextInt(); // 시작 바구니 번호
            int end = sc.nextInt(); // 끝 바구니 번호
            int ball = sc.nextInt(); // 넣을 공의 번호

            // 시작 바구니부터 끝 바구니까지 반복하면서 ball번 공을 넣음
            for (int i = start - 1; i <= end - 1; i++) {
                baskets[i] = ball;  
            }
        }

        // 바구니의 상태 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }	
	}
}