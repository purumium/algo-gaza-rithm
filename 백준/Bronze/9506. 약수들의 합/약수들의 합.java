import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 1. 완전수 : 약수인지 아닌지를 구하기(나눴을 때 0으로 떨어짐)
		// 2. 오름차순으로 나열하기
		// 오름차순으로 나열하기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int diverty = sc.nextInt();

			// -1이 들어왔을 때 종료
			if(diverty == -1) break;

			// 약수 구해서 배열에 넣기
			int sum = 0;
			List<Integer> list = new ArrayList<>();

			for(int i = 1; i < diverty; i++) {
				if( diverty % i == 0 ) {
					list.add(i);
					sum += i;
				}
			}
			
			// 구한 약수를 모두 더했을 때, 
			// 1. 더한 값 = diversity라면 더한 값으로 표현
			// 2. 더한 값 != diversity 
			String result = "";
			if(sum == diverty) {
				result += diverty + " = ";
				for (int i = 0; i < list.size(); i++) {
					if( i == list.size() - 1 ) {
						result += list.get(i);
					}
					else {
						result += list.get(i) + " + ";
					}
				}
				System.out.println(result);
			} else {
				System.out.println(diverty + " is NOT perfect.");
			}	
		}
		sc.close();
	}

}