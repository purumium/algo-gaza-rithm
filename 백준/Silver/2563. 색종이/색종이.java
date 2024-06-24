import java.util.Scanner;

public class Main {
	public static void main(String[ ]arg) {

	    Scanner sc = new Scanner(System.in);
	
	    // 총 3개 입력
	    int num = sc.nextInt();
	
	    // 입력 받은 x, y는 + 10이 됨
	    boolean[][] paper = new boolean[100][100];
	
	    for (int i = 0; i < num; i++) {
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	
	        for (int xd = 0; xd < 10; xd++) {
	            for (int yd = 0; yd < 10; yd++) {
	                paper[ x + xd ][ y + yd ] = true;
	            }
	        }
	    }

	    int areaCount = 0;
	    for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if( paper[i][j] ) areaCount++;
			}
		}
	    System.out.println(areaCount);  
   }  
}

