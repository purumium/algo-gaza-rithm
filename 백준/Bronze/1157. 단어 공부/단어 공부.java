import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 단어를 대문자로 변경
		String word = sc.nextLine().toUpperCase(); 
		
		// 알파벳 각 자리를 count할 배열 만들기
		int[] alphabet = new int[26];

		// 알파벳 배열에 알파벳이 나온 횟수를 count
		for (char c : word.toCharArray()) {
				alphabet[c - 'A']++; 
		}
		
		// for문으로 배열을 돌면서 가장 많이 나온 횟수와, 해당 idx값 찾기
		int max = -1;
		char maxChar = '?';
		for (int i = 0; i < alphabet.length; i++) {
				if( max < alphabet[i] ) {
						max = alphabet[i];
						maxChar = (char)('A' + i); 
				} else if ( max == alphabet[i] ) {
						maxChar = '?';
				}
		}
		System.out.println(maxChar);
	}
}