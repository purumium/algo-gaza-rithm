import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 입력받기
        int n = sc.nextInt();
        
        // 각 테스트 케이스의 거스름돈을 저장할 배열
        int[] change = new int[n];
        
        // 테스트 케이스의 거스름돈 입력받기
        for (int i = 0; i < change.length; i++) {
            change[i] = sc.nextInt();
        }
        
        // 각 금액의 단위(쿼터, 다임, 니켈, 페니)
        int[] dollar = {25, 10, 5, 1};

        // 각 테스트 케이스에 대한 결과를 저장할 배열
        int[][] result = new int[n][dollar.length];

        // 각 테스트 케이스에 대해 거스름돈을 계산
        for (int i = 0; i < n; i++) {
            // 현재 테스트 케이스의 거스름돈
            int remainChange = change[i];
            
            // 각 금액 단위에 대해 거스름돈 계산
            for (int j = 0; j < dollar.length; j++) {
                // 현재 금액 단위로 나눌 수 있는 최대 개수 계산
                int totalDollar = remainChange / dollar[j];  // 예: 124 / 25 = 4
                // 나머지 금액 계산
                remainChange = remainChange % dollar[j];     // 예: 124 % 25 = 24

                // 결과 배열에 저장
                result[i][j] = totalDollar;
            }    
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < dollar.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Scanner 닫기
        sc.close();
    }
}