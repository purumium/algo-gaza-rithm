import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 단어를 char[]로 바꾸기
		String word = sc.next();
		char[] wordArr = word.toCharArray();
		
		// 거꾸로 바꾸기
		char temp;
		int lastIdx = wordArr.length - 1;  // 마지막 idx
		for (int i = 0; i < wordArr.length/2 ; i++) {
			temp = wordArr[i];
			wordArr[i] = wordArr[lastIdx];
			wordArr[lastIdx] = temp;
			
			lastIdx--;
		}
		
		// changeWord된 wordArr배열을 String으로 만들기
		String changeWord = String.valueOf(wordArr);
		
		int result = word.equals(changeWord) == true ? 1 : 0;
		System.out.println(result);
	}
}