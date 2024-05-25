import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	sc.nextLine();  // 힌 줄 소비
    	String str = sc.nextLine();
    	
    	char[] arr = str.toCharArray();  // 단어 1개씩 들어가는 배열 생성
    	
    	int count = 0;
    	for (char num : arr) {
    		count += Character.getNumericValue(num);  // char -> int
			
    	}
    	System.out.println(count);      
    }
}