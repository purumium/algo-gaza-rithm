import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 줄에 테스트 케이스의 개수를 입력 받음
        int T = sc.nextInt();

        // 각 테스트 케이스를 처리
        for (int t = 0; t < T; t++) {
            // 반복 횟수를 입력 받음
            int R = sc.nextInt();
            // 문자열을 입력 받음
            String S = sc.next();

            // 새로운 문자열 P를 생성
            StringBuilder P = new StringBuilder();
            for (char c : S.toCharArray()) {
                // 각 문자를 R번 반복하여 P에 추가
                for (int i = 0; i < R; i++) {
                    P.append(c);
                }
            }

            // 결과 출력
            System.out.println(P.toString());
        }

        sc.close();
    }
}
