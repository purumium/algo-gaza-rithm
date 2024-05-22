import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] score = new int[n];
        
        // 배열에 점수 입력 받기
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        
        // 최댓값 구하기
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        
        // 새로운 점수 계산 및 합계 구하기
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) score[i] / max * 100;
        }
        
        // 새로운 평균 계산
        double avg = sum / n;
        
        // 결과 출력
        System.out.printf("%.6f\n", avg);
    }
}
