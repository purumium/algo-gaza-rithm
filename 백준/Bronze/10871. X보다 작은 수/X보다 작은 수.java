import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		// 정수 N개로 이루어진 배열 A
		// 정수 X
		// A 배열에서 X보다 작은 주를 모두 출력
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int integerN = sc.nextInt();
		
		int[] array = new int[n]; 
		String result = "";
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			
			if(array[i] < integerN) {
				result += array[i] + " ";
			}			
		}
		System.out.println(result);		
	}
}