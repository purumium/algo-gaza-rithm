import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int needTime = sc.nextInt();
		int endTime = min + needTime; // 요리가 끝나는 시간
		
		if( endTime <= 59 ) { // 요리시간이 60분 미만인 경우
			System.out.println( hour + " " + endTime );
		} else { // endTime >= 60 (요리시간이 60분이 넘는 경우)
			//1. (시간) : needTime / 60 = 몫 
			//2. (분) : needTime % 60 = 나머지							
			int totalHour = hour + (endTime / 60);
			int totalEndTime= endTime % 60;
			
			if( totalHour <= 23 ) {
				System.out.println( totalHour + " " + totalEndTime);
			} else { // 전체 요리 시간을 구했을 때, 24시(오전 0시)가 넘는 경우
				System.out.println( ( totalHour % 24 ) + " " + totalEndTime );				
			}			
		}
		
	}
}
