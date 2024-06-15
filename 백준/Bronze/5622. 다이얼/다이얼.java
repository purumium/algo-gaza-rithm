import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        
        // 입력된 단어를 문자 배열로 변환
        char[] word = sc.nextLine().toCharArray();
        
        int sum = 0;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < dial.length; j++) {
                if ( dial[j].indexOf(word[i]) != -1 ) {  // 문자 포함 여부 확인
                    sum += (j + 3);  // 각 다이얼의 숫자에 해당하는 시간을 더함
                    break;  // 해당 문자를 찾으면 더 이상 탐색할 필요 없음
                }
            }
        }
        System.out.println(sum);
    }
}