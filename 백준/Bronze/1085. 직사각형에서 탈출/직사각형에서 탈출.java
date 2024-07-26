import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();  // 기준 x
		int y = sc.nextInt();  // 기준 y
		int w = sc.nextInt();
		int h = sc.nextInt();

		// (0, 0)에서 현재 기준(x, y)까지(left, bottom)
		// 현재 기준(x, y)에서 (w, h)까지(right, top)

		int left = x;
		int bottom = y;
		int right =  w - x;
		int top = h - y;

		// 4개 중에서 최솟값
		int result = Math.min( Math.min(left, right), Math.min(top, bottom) );
		System.out.println(result);

		sc.close();
	}
}