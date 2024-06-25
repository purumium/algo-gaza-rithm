import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // B진법의 수 N
        String n = sc.next();
        
        // B진법
        int b = sc.nextInt();
        
        // N을 10진법으로 변환
        int decimalValue = 0;
        
        // 각 자리의 가중치
        int power = 1;
        
        // 가장 오른쪽 자리부터 계산하기 위해 문자열을 역순으로 처리
        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            int value;
            if (c >= 'A' && c <= 'Z') {
                value = c - 'A' + 10; // 문자를 숫자로 변환 (A는 10, B는 11, ..., Z는 35)
            } else {
                value = c - '0'; // 숫자는 그대로 사용('9' - '0' = 57 - 48)
            }
            
            // 각 자릿수의 가중치를 곱해서 더하기
            decimalValue += value * power;
            
            // 가중치를 다음 자릿수로 이동
            power *= b;
        }
        
        System.out.println(decimalValue);
        
        sc.close();
    }
}