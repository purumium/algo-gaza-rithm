import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		for (String crocein : alphabet) {
			input = input.replace(crocein, "1");
		}

		System.out.println( input.length() );
	}
}