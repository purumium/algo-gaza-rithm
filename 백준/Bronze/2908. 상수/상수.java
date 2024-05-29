import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//1. 단어를 받고
		String numStr1 = sc.next();
		String numStr2 = sc.next();
		
		//2. 단어의 처음과 끝을 바꾸는 메서드
		String str1 = swapMethod(numStr1);
		String str2 = swapMethod(numStr2);
		
		//4. max값
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int max = (num1 > num2) ? num1 : num2;
		
		System.out.println(max);
	}

	// 3. char[] 배열 만들어서, 단어의 앞 뒤를 바꾸기
	private static String swapMethod(String numStr) {
		char[] tempArr = numStr.toCharArray();
		
		char temp;
		
		temp = tempArr[0];
		tempArr[0] = tempArr[2];
		tempArr[2] = temp;
		
		// return값은 String으로 변경해서 반환
		String str = String.valueOf(tempArr);
		
		return str;
	}	
}