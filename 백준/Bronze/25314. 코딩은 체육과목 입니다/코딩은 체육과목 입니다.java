import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longInt = sc.nextInt();
		
		String result = "long";
		for(int i = 1; i < longInt/4; i++) {
			result += " long"; 
		}
		result += " int";
		
		System.out.println(result);
	}
}