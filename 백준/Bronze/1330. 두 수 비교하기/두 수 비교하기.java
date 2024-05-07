import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int str1 = sc.nextInt();
		int str2 = sc.nextInt();

		if(str1 > str2) {
			System.out.println(">");
		} else if (str1 < str2 ) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}