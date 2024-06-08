import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine(); // 한 줄로 입력 받기
		
		// 앞뒤 공백을 제거하고, 공백 하나 이상으로 구분된 단어를 배열로 분리하기
		String[] word = input.trim().split("\\s+");
		int wordCount = word.length;
		
		// 문자열에 공백만 있어면 단어 개수는 0
		if( input.trim().isEmpty() ) {
			wordCount = 0;
		}
		
		System.out.println(wordCount);
	}
}


