import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 9개의 정수가 주어지고
		// 이것의 최댓값을 찾고
		// 그 최댓값이 몇 번째 수인지를 찾기
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[9];  // 9개의 정수를 넣을 배열
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();  // 정수를 배열에 넣기
		}
		
		int max = array[0];
		int indexMax = 0; // 최댓값의 위치
		
		for (int i = 1; i < array.length; i++) {
			if( max < array[i] ) {
				max = array[i];	
				indexMax = i;
			}
		}
		System.out.println(max);
		System.out.println(indexMax + 1);	
	}
}