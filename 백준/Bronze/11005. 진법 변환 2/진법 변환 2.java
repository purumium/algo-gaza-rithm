import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 10진법의 수
        int n = sc.nextInt();
        
        // 목표 진법
        int b = sc.nextInt();
        
        // 변환된 결과를 저장
        StringBuilder sb = new StringBuilder();
        
        // 10진법을 b진법으로 변경 => 10 % b = 나머지를 거꾸로 저장
        while( n > 0 ) {
        	int remainder = n % b;
        	if(remainder < 10) {
        		sb.append(remainder);
        	} else {
        		// 10 이상의 숫자는 문자로 표현함
        		sb.append( (char)(remainder - 10 + 'A') );  
        		// (char)(0 + 'A') = (char)(65) = A
        	}
        	n = n / b;
        }
        String result = sb.reverse().toString();
        System.out.println(result);
        
    }
}