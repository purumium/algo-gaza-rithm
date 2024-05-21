import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        // Set은 중복된 값이 저장되지 않음
        Set<Integer> noDuplication = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
        	// 각 수를 42로 남은 값 자체를 Set 집합에 넣음
			int num = sc.nextInt() % 42;
			
			noDuplication.add(num); 
		}
        
        System.out.println(noDuplication.size());       
    }       
}