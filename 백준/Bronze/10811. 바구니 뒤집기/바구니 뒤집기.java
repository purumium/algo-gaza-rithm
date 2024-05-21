import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] basket = new int[n];
		for (int i = 0; i < basket.length; i++) {
			basket[i] = i + 1;
		}
		
		// temp를 써서 좌우를 바꾸기		
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt() - 1;  // index로 사용
			int end = sc.nextInt() - 1;
			
			int temp;
			while(start < end) { 
				temp = basket[start];
	 			basket[start] = basket[end];
	 			basket[end] = temp;
	 			
	 			start++;
	 			end--;
			}
		}
		
		for (int num : basket) {
			System.out.print(num + " ");
		}	
	}	
}