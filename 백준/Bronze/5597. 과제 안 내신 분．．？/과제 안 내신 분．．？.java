import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int[] submitted = new int[30]; // 제출한 학생들의 출석번호를 저장할 배열

        // 제출한 학생들의 출석번호를 입력받음
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();           
            submitted[num - 1] = 1;  // 출석번호별 idx에 1을 저장
            					     // 없는 idx는 0으로 저장
        }
        
        for (int i = 0; i < 30; i++) {
			if(submitted[i] == 0) System.out.println(i + 1);
		}
    }
}