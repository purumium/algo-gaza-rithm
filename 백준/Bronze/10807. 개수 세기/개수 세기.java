import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		// 정수 n
		// 정수 n개가 공백으로 구분된 배열
		// 찾으려는 수 => 몇 개?		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정수 N개
		
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();  // 배열
		}
		
		int searchNum = sc.nextInt(); // 찾고자 하는 수
		int count = 0;
		
		for (int num : array) {
			if(searchNum == num) count++;
		}
		
		System.out.println(count);		
	}
}
