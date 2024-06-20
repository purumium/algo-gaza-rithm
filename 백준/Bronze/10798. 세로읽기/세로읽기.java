import java.util.Scanner;

public class Main {
	public static void main(String[ ]arg) {
        Scanner sc = new Scanner(System.in);
        
        // 5개의 단어를 담고
        String[] strArr = new String[5];
        for (int i = 0; i < 5; i++) {
        	strArr[i] = sc.nextLine();			
		}
        
        StringBuilder result = new StringBuilder();
        
        // 각 단어의 charAt(i)를 세로로 읽기
        // strArr[i] 1개가 몇 개의 문자로 이루어져 있는지 알 수 없음, 15로 일단 설정
        for (int i = 0; i < 15 ; i++) {
			for (int j = 0; j < 5; j++) {
				if( i < strArr[j].length() && strArr[j].charAt(i) != ' ' ) {  // 단어가 몇 개의 문자로 이루어져 있는지 확인
					result.append( strArr[j].charAt(i) );
				}
			}
		}
        System.out.println( result.toString() );
  }	
}