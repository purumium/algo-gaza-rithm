import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 정수 N개
		// N개의 정수가 공백으로 주어짐 => 배열에 넣고
		// 배열 내의 요소끼리 비교해서 최소와 최대 구하기
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  // 정수 N개
		
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();  // 정수를 배열에 넣기
		}
		
		int min = array[0];
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(min > array[i]) min = array[i];			
			if(max < array[i]) max = array[i];
		}
		System.out.println(min + " " + max);		
	}
}